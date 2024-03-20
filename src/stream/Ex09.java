package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {

/*
        문제 9. 도서관 책 대여 기록 분석

        도서관의 책 대여 기록이 있습니다.
        각 대여 기록에는 사용자 ID와 대여한 책의 수량이 포함되어 있습니다.
        여러분의 목표는 다음 정보를 계산하는 것입니다.

        전체 대여된 책의 수량을 계산하세요.
        대여 기록이 가장 많은 사용자의 ID를 찾으세요.

        record BookRental(String userId, int quantity) {}

        List<BookRental> rentals = Arrays.asList(
            new BookRental("user1", 3),
            new BookRental("user2", 5),
            new BookRental("user3", 1),
            new BookRental("user4", 2)
        );

        출력예시
        ===
        전체 대여된 책의 수량 : 11
        가장 많은 책을 대여한 사용자 : user2
*/

        List<BookRental> rentals = Arrays.asList(
                new BookRental("user1", 3),
                new BookRental("user2", 5),
                new BookRental("user3", 1),
                new BookRental("user4", 2)
        );

        long quantities = rentals.stream()
                .mapToInt(BookRental::quantity)
                .count();
        System.out.println("▤|▤ 전체 대여된 책의 권수 : " + quantities + "권");

        String bestReader = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity))
                .map(book -> book.userId)
                .orElse("정보를 찾을 수 없습니다.");
        System.out.println("▤|▤ 가장 많은 책을 대여한 사용자 : " + bestReader);
    }

    record BookRental(String userId, int quantity) {}
}
