package loop;

import java.util.Scanner;

public class LoopEx08 {
    public static void main(String[] args) {

/*
        은행 앱

        ------------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        ------------------------------------
        선택>
        1. 번을 선택할 경우
        예금액> 10000    → 잔고에 10000원이 입금
        2. 번을 선택할 경우
        출금액> 1000     → 잔고에서 1000원이 출금
        3. 번
        잔고액> 9000     → 잔고액 확인가능
        4. 번
        "프로그램이 종료됩니다"
*/

        Scanner scanner = new Scanner(System.in);

        boolean runApp = true;
        int balance = 0;

        while (runApp) {
            System.out.println("\n★이용하시고자 하는 메뉴의 번호를 입력해 주세요.★");
            System.out.println("------------------------------------");
            System.out.println("(1) 예금 | (2) 출금 | (3) 잔고 | (4) 종료");
            System.out.println("------------------------------------");
            System.out.print("이용 메뉴 번호 : ");
            int enteredNumber = scanner.nextInt();

            switch (enteredNumber) {
                case 1 :
                    System.out.print("\'예금\'을 클릭하셨습니다.예금액을 입력해 주세요 : ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2 :
                    System.out.print("\'출금\'을 클릭하셨습니다.출금액을 입력해 주세요 : ");
                    int withdraw = scanner.nextInt();
                    balance -= withdraw;
                    break;
                case 3 :
                    System.out.println("\'잔고\'를 클릭하셨습니다. 총 잔액은 " + balance + "원 입니다.");
                    break;
                case 4 :
                    System.out.println("\'종료\'를 클릭하셨습니다.이용해 주셔서 감사합니다.");
                    runApp = false;
                    break;
            }
            if (enteredNumber <= 0 || enteredNumber > 4) {
                System.out.println("잘못 입력하셨습니다. 번호 확인 후 다시 시도해 주시기를 바랍니다.");
                runApp = false;
            }
        }

    }
}
