package Loop;

import java.util.Scanner;

public class LoopEx04_2 {
    public static void main(String[] args) {

/*
        다이아몬드 패턴 출력하기
        홀수 정수 n을 입력받아 n의 높이를 가지는 다이아몬드 패턴 출력 프로그램
        n = 5

           *
          ***
         *****
          ***
           *
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력하고 싶은 다이아몬드 패턴 줄 수를 입력하세요(홀수) : ");
        int enteredNumber = scanner.nextInt();

        for (int line1 = 0; line1 < enteredNumber; line1 += 2) {
            for (int numberOfBlank1 = enteredNumber; numberOfBlank1 > line1; numberOfBlank1 -= 2) {
                System.out.print(" ");
            }
            for (int numberOfStar1 = 0; numberOfStar1 <= line1; numberOfStar1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int line2 = 2; line2 < enteredNumber; line2 += 2) {
            for (int numberOfBlank2 = 0; numberOfBlank2 <= line2; numberOfBlank2 += 2) {
                System.out.print(" ");
            }
            for (int numberOfStar2 = enteredNumber; numberOfStar2 > line2; numberOfStar2--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
