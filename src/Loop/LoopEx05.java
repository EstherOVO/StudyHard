package Loop;

import java.util.Scanner;

public class LoopEx05 {
    public static void main(String[] args) {

/*
        짝수의 합 구하기
        사용자로부터 두 정수 start와 end를 입력받아,
        start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int firstNumber = scanner.nextInt();
        System.out.print("두 번째 정수 : ");
        int secondNumber = scanner.nextInt();

        System.out.print(firstNumber + " ~ " + secondNumber + " 사이의 짝수 :");

        int sum = 0;
        for (int even = firstNumber; even < secondNumber; even++) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
                sum += even;
            }
        }
        System.out.println("\n총 합계 : " + sum);

    }
}
