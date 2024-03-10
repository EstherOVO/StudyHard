package library;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Ex09 {
    public static void main(String[] args) {

/*
        연습 문제 2 : 월드컵 개최일까지 남은 시간 계산하기

        요구사항 : 특정 월드컵 개최일까지 남은 년, 월, 일을 계산하세요.
        예를 들어, 다음 월드컵이 2026년 6월 14일에 시작한다고 할 때,
        오늘 날짜로부터 개최일까지 남은 시간을 Period를 사용하여 계산하세요.

        입력 예시 : (자동으로 현재 날짜를 가져옵니다)

        출력 예시 :
        다음 월드컵은 3년 8개월 21일 후에 시작합니다!
*/

        LocalDate worldCup = LocalDate.of(2026, 6, 14);

        Period betweenNowAndWorldCup = Period.between(LocalDate.now(), worldCup);

        int years = betweenNowAndWorldCup.getYears();
        int months = betweenNowAndWorldCup.getMonths();
        int days = betweenNowAndWorldCup.getDays();

        System.out.println("= 북중미 월드컵 D-DAY =");
        System.out.println(String.format("월드컵까지 %d년 %d개월 %d일 남았습니다!", years, months, days));
    }
}
