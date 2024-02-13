package Loop;

import java.util.Scanner;

public class LoopEx04 {
    public static void main(String[] args) {

/*
        별 찍기
        사용자로부터 정수 n을 입력받아, n줄 만큼의 별(*)을
        삼각형 모양으로 출력하는 프로그램을 작성하세요.
        (input) 별의 줄 수 : 2
        *
        **
        (input) 별의 줄 수 : 4
        *
        **
        ***
        ****
        Hint : 중첩 for문, System.out.print()
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력하고 싶은 별의 줄 수를 입력하세요 : ");
        int enteredNumber = scanner.nextInt();

        for (int line = 0; line < enteredNumber; line++) {
            for (int numberOfStar = 0; numberOfStar <= line; numberOfStar++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
