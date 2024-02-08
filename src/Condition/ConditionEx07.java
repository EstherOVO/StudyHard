package Condition;

import java.util.Scanner;

public class ConditionEx07 {
    public static void main(String[] args) {

/*
         삼항 연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해 주세요.
         Hint : num % 2
*/

        Scanner scanner = new Scanner(System.in);

        System.out.printf("수를 입력하세요 : ");
        int number = scanner.nextInt();

        int oddEven = number % 2;
        String result = (oddEven == 0) ? "짝수입니다." : "홀수입니다.";

        System.out.println(result);

    }
}
