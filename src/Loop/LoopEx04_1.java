package Loop;

import java.util.Scanner;

public class LoopEx04_1 {
    public static void main(String[] args) {

/*
           별의 패턴을 반대로 출력하기
           ****
           ***
           **
           *
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력하고 싶은 별의 줄 수를 입력하세요 : ");
        int enteredNumber = scanner.nextInt();

        for (int line = 0; line < enteredNumber; line++) {
            for (int numberOfStar = enteredNumber; numberOfStar > line; numberOfStar--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
