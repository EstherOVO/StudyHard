package library;

import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

/*
        연습 문제 3 : 국제 회의 시간대 출력

        요구사항 : 뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
        이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
        ZonedDateTime과 ZoneId를 사용하여 시간대 변환을 수행하세요.

        출력 예시 :
        회의는 뉴욕 기준 오후 3시에 시작합니다.
        서울에서는 회의가 오전 5시에 시작합니다.
        런던에서는 회의가 오후 8시에 시작합니다.
*/

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("(1) 한국 | (2) 일본 | (3) 미국");
                System.out.print("기준 시간대의 번호를 입력해 주세요 : ");
                int button = scanner.nextInt();

                System.out.print("회의 날짜를 말씀해 주세요(YYYY-MM-DD) : ");
                String date = scanner.next();
                System.out.print("회의 시간을 말씀해 주세요(HH:MM) : ");
                String time = scanner.next();

                String[] splitDate = date.split("-");
                String[] splitTime = time.split(":");

                int[] dates = new int[3];
                for (int i = 0; i < splitDate.length; i++) {
                    dates[i] = Integer.parseInt(splitDate[i]);
                }

                int[] times = new int[2];
                for (int i = 0; i < splitTime.length; i++) {
                    times[i] = Integer.parseInt(splitTime[i]);
                }

                switch (button) {
                    case 1 :
                        kst(dates, times);
                        break;
                    case 2 :
                        ust(dates, times);
                        break;
                    case 3 :
                        jst(dates, times);
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 시도해 주시기를 바랍니다.");
            }
        }
    }

    public static void kst(int[] dates, int[] times) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime seoul = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("Asia/Seoul"));

        ZonedDateTime tokyo = seoul.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("▣ 기준 시간(대한민국 서울) : " + formatter.format(seoul));
        System.out.println("[일본] 도쿄 : " + formatter.format(tokyo));
        System.out.println("[미국] 뉴욕 : " + formatter.format(newYork));
    }

    public static void ust(int[] dates, int[] times) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime newYork = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("America/New_York"));

        ZonedDateTime seoul = newYork.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime tokyo = newYork.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("▣ 기준 시간(미국 뉴욕) : " + formatter.format(newYork));
        System.out.println("[대한민국] 서울 : " + formatter.format(seoul));
        System.out.println("[일본] 도쿄 : " + formatter.format(tokyo));
    }

    public static void jst(int[] dates, int[] times) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime tokyo = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("Asia/Seoul"));

        ZonedDateTime seoul = tokyo.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime newYork = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("▣ 기준 시간(일본 도쿄) : " + formatter.format(tokyo));
        System.out.println("[대한민국] 서울 : " + formatter.format(seoul));
        System.out.println("[미국] 뉴욕 : " + formatter.format(newYork));
    }
}
