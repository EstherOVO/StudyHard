package Loop;

import java.util.Scanner;

public class LoopEx02 {
    public static void main(String[] args) {

/*
        팩토리얼 계산하기
        사용자로부터 정수 n을 입력받아,
        n! (팩토리얼)의 값을 계산하는 프로그램을 작성하세요.
        while 반복문을 사용하여 구현합니다.
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해 주세요 : ");
        int enteredNumber = scanner.nextInt();

        int factorial = 1;
        int number = 1;

        while (number <= enteredNumber) {
            factorial *= number;
            number++;
        }
        System.out.println(enteredNumber + "! = " + factorial);

    }
}
