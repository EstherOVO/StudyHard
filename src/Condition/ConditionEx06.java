package Condition;

import java.util.Scanner;

public class ConditionEx06 {
    public static void main(String[] args) {

/*      회원의 등급이 A, B, C, D가 있습니다.
        등급이 A일 경우 : VVIP와 VIP 혜택
        등급이 B일 경우 : VIP 혜택
        등급이 C일 경우 : 우수회원과 일반회원 혜택
        등급이 D일 경우 : 일반회원 혜택
        모든 경우 마지막에는 "감사합니다"를 출력합니다.
        Switch문을 활용해서 각 등급마다 혜택을 받는 조건문 프로그래밍을 만들어주세요.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.printf("본인의 등급(A / B / C / D)을 입력해 주세요 : ");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A" :
                System.out.println("A등급입니다. VVIP와 VIP 혜택을 제공받으실 수 있습니다.\n\n감사합니다.");
                break;
            case "B" :
                System.out.println("B등급입니다. VIP 혜택을 제공받으실 수 있습니다.\n\n감사합니다.");
                break;
            case "C" :
                System.out.println("C등급입니다. 우수회원과 일반회원 혜택을 제공받으실 수 있습니다.\n\n감사합니다.");
                break;
            case "D" :
                System.out.println("D등급입니다. 일반회원 혜택을 제공받으실 수 있습니다.\n\n감사합니다.");
                break;
        }

        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")) {
        } else {
            System.out.println("잘못 입력하셨습니다. 다시 시도해 주세요. (A / B / C / D 등급 중 입력)");
        }
    }
}
