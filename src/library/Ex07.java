package library;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

/*
        연습 문제 3 : 이자 계산기

        요구사항 : 사용자로부터 원금(Principal), 연이율(Annual Interest Rate), 기간(Term in years)을 입력받아
        간단한 이자 계산기를 구현하세요. 계산된 이자는 복리로 계산되며, 연이율은 소수점 형태로 입력됩니다.
        최종 금액을 BigDecimal을 사용하여 계산하고 정확도 높게 출력하세요.

        공식 : 최종 금액 = 원금 * (1 + 연이율)^기간

        입력 예시
        ===
        원금: 1000
        연이율: 0.05 (5%)
        기간: 10년

        출력 예시
        ===
        최종 금액: 1628.89
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("= 이자 계산기 =");
        System.out.print("원금 : ");
        int principal = scanner.nextInt();

        System.out.print("연이율 : ");
        double air = scanner.nextDouble();

        System.out.print("기간(년) : ");
        int year = scanner.nextInt();

        BigDecimal b1 = new BigDecimal(principal);
        BigDecimal b2 = new BigDecimal(air);
        BigDecimal b3 = new BigDecimal(year);

        BigDecimal add = b2.add(BigDecimal.ONE);
        BigDecimal pow = add.pow(year);
        BigDecimal interestRate = pow.multiply(b1);

        System.out.println(String.format("이자율 : %.2f", interestRate));
    }
}
