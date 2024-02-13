package Loop;

import java.util.Scanner;

public class LoopEx03 {
    public static void main(String[] args) {

/*
        구구단 출력하기
        사용자로부터 정수 n을 입력받아,
        n단의 구구단을 출력하는 프로그램을 작성해 주세요.
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 단부터 몇 단까지 알려드릴까요~!\n첫 번째 단(~단 부터) : ");
        int firstNumber = scanner.nextInt();
        System.out.print("두 번째 단(~단 까지) : ");
        int secondNumber = scanner.nextInt();

        for (int timesTable = firstNumber; timesTable <=secondNumber; timesTable++) {
            System.out.println(timesTable + "단 : ");
            for (int result = 1; result <= 9; result++) {
                System.out.println(timesTable + " x " + result + " = " + (timesTable * result));
            }
        }

    }
}
