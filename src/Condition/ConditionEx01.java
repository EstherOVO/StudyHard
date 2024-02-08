package Condition;

import java.util.Scanner;

public class ConditionEx01 {
    public static void main(String[] args) {

/*
        환율 계산하기
        달러 환율이 1327원이다.
        달러를 0원 입금 받으면 "환전할 금액이 없습니다."
        양수일 때 환전금액은 "00000원 입니다."
        음수일 때 "잘못 입력하셨습니다"
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("환전하실 금액(달러)을 입력해 주세요 : ");
        int dollar = scanner.nextInt();

        int won = dollar * 1327;

        if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0) {
            System.out.println("총 환전 금액은 " + won + "원입니다.");
        } else if (dollar < 0) {
            System.out.println("잘못 입력했습니다. 다시 시도해 주세요.");
        }

    }
}
