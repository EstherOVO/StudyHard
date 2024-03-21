package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14 {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                1. 도서 검색
                2. 모든 책의 평균 페이지 수 계산
                3. 특정 장르 책의 평균 출판연도 계산
                4. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
                5. 각 장르별 책의 수 계산
                6. 가장 많은 책이 출판된 장르 찾기
                0. 종료
                """);

        while (true) {

            try {

                System.out.println();
                System.out.print("♧ 실행할 작업의 번호를 입력해 주세요 : ");
                int number = scanner.nextInt();
                scanner.nextLine();

                validateNumber(number);

                switch (number) {
                    case 1 :
                        System.out.print("♧ 찾으시는 도서의 도서명(혹은 작가명)을 입력해 주세요 : ");
                        String info = scanner.nextLine();
                        searchBook(books, info);
                        break;
                    case 2 :
                        double pagesAvg = books.stream()
                                .mapToInt(Book::pages)
                                .average()
                                .orElse(Double.NaN);
                        System.out.println(String.format("♣ 모든 책의 평균 페이지 수 : %,.0f 페이지", pagesAvg));
                        break;
                    case 3 :
                        System.out.print("♧ 장르를 입력해 주세요 : ");
                        String genre = scanner.nextLine();
                        genreYearAvg(books, genre);
                        break;
                    case 4 :
                        System.out.print("♧ 연도를 입력해 주세요 : ");
                        int year = scanner.nextInt();
                        System.out.print("♧ 페이지 수를 입력해 주세요 : ");
                        int page = scanner.nextInt();

                        books.stream()
                                .filter(book -> book.publishYear >= year)
                                .filter(book -> book.pages >= page)
                                .sorted(Comparator.comparing(Book::publishYear).thenComparing(Book::pages))
                                .forEach(book -> System.out.println("♣ [%s] <%s> | 작가 : %s | 출판연도 : %d년 | 페이지 수 : %d 페이지".formatted(book.genre, book.title, book.author, book.publishYear, book.pages)));
                        break;
                    case 5 :
                        Map<String, Long> collect1 = books.stream()
                                .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));
                        collect1.forEach((g, p) -> System.out.println(String.format("♣ 장르 : %s | 보유 권수 : %d권", g, p)));
                        break;
                    case 6 :
                        Map<String, Long> collect2 = books.stream()
                                .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));

                        String goodBook = collect2.entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey)
                                .orElse("정보를 찾을 수 없습니다.");
                        System.out.println("♣ 가장 많은 책이 출판된 장르 : [" + goodBook + "] (보유 권수 : " + collect2.get(goodBook) + "권)");
                        break;
                    case 0 :
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public record Book(String title, String genre, String author, int publishYear, int pages) {}

    public static void searchBook(List<Book> books, String query) {

        List<Book> list = books.stream()
                .filter(book -> book.author.contains(query) || book.title.contains(query))
                .toList();
        list.forEach(book -> System.out.println("♣ [%s] <%s> | 작가 : %s | 출판연도 : %d년 | 페이지 수 : %d 페이지".formatted(book.genre, book.title, book.author, book.publishYear, book.pages)));
    }

    public static void genreYearAvg(List<Book> books, String genre) {

        double yearAvg = books.stream()
                .filter(book -> book.genre.contains(genre))
                .mapToInt(Book::publishYear)
                .average()
                .orElse(Double.NaN);
        System.out.println(String.format("♣ [%s] 평균 출판연도 : %.0f년", genre, yearAvg));
    }

    public static void validateNumber(int number) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (number < 0 || number > 6) {
            exceptionMessage.append("잘못된 입력입니다. 번호를 확인해 주시기를 바랍니다.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
