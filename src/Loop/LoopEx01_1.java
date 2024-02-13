package Loop;

import java.util.Scanner;

public class LoopEx01_1 {
    public static void main(String[] args) {

//      정수 두 개를 받아 반복문을 이용해서 두 값 사이의 짝수를 출력해 주세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int firstNumber = scanner.nextInt();
        System.out.print("두 번째 정수 : ");
        int secondNumber = scanner.nextInt();

        System.out.print(firstNumber + " ~ " + secondNumber + " 사이의 짝수 :" );
        for (int even = firstNumber; even < secondNumber; even++) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
        }

    }
}
