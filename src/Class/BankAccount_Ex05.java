package Class;

import java.util.Scanner;

public class BankAccount_Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String validAccount = "123-4567-8910-11";
        final String validUsername = "김자바";

        System.out.print("· 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("· 계좌를 입력하세요 : ");
        String account = scanner.nextLine();

        BankAccount bankAccount = new BankAccount(name, account);

        if (validUsername.equals(name) && validAccount.equals(account)) {
            System.out.print("· 입금하실 금액을 입력하세요 : ");
            int deposit = scanner.nextInt();
            bankAccount.getDeposit(deposit);

            System.out.print("· 출금하실 금액을 입력하세요(없으면 \'0\' 입력) : ");
            int withdraw = scanner.nextInt();
            bankAccount.getWithdraw(withdraw);

            bankAccount.getBalance();
        } else {
            System.out.println("성함과 계좌번호가 일치하지 않습니다. 다시 확인해 주시기를 바랍니다.");
        }

        System.out.println("\n§ 이용해 주셔서 감사합니다. §");
    }
}
