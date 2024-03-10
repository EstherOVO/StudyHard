package library;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

/*

        연습 문제 1 : 다가오는 생일까지 남은 날짜 계산하기

        요구사항 :
        사용자로부터 생년월일을 입력받아, 올해의 생일이 지났는지 여부에 따라
        올해 또는 내년 생일까지 남은 날짜를 계산하여 출력하세요.
        사용자의 생년월일과 현재 날짜에 LocalDate를 사용하고,
        남은 날짜 계산에는 Period 클래스를 활용하세요.

        입력 예시 : 1990-05-24

        출력 예시 (올해 생일이 지났을 경우) :
        다음 생일까지 240일 남았습니다!

        출력 예시 (올해 생일이 아직 안 지났을 경우) :
        다음 생일까지 30일 남았습니다!
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("생일년월일을 입력해 주세요(YYYY-MM-DD) : ");
        String birth = scanner.nextLine();

        String[] split = birth.split("-");

        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        LocalDate now = LocalDate.now();
        LocalDate thisBirth = LocalDate.of(now.getYear(), month, day);
        LocalDate nextBirth = LocalDate.of(now.getYear() + 1, month, day);

        if (now.isBefore(thisBirth)) {
            long until1 = now.until(thisBirth, ChronoUnit.DAYS);
            System.out.println("오늘부터 생일까지는 앞으로 %d일 남았습니다!".formatted(until1));
        } else if (now.isAfter(thisBirth)) {
            long until2 = now.until(nextBirth, ChronoUnit.DAYS);
            System.out.println("올해 생일은 지났군요! 내년 생일까지 앞으로 %d일 남았습니다!".formatted(until2));
        }

    }
}
