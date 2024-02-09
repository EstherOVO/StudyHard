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

        System.out.print("환전하실 금액(달러)를 입력해 주세요 : ");
        String enteredDollar = scanner.nextLine();

        System.out.print("총 환전하실 금액이 " + enteredDollar + "달러가 맞습니까? (Y / N) : ");
        String enteredAnswer = scanner.nextLine();

        scanner.close();

        int enteredDollar2 = Integer.parseInt(enteredDollar);
        int exchangeWon = enteredDollar2 * 1327;

        switch (enteredAnswer) {
            case "Y" :
                if (enteredDollar2 == 0) {
                    System.out.println("환전하실 금액(달러)가 없습니다.");
                } else if (enteredDollar2 > 0) {
                    System.out.println("총 환전 금액은 " + exchangeWon + "원입니다.");
                } else if (enteredDollar2 < 0) {
                    System.out.println("잘못 입력하셨습니다. 금액(달러)을 확인해 주시기를 바랍니다.");
                }
                break;

            case "N" :
                System.out.println("'N'를 입력하셨습니다.\n처음부터 다시 시도해 주시기를 바랍니다.");
                break;
        }

    }
}