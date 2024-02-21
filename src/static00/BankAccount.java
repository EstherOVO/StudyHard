package static00;

import java.text.DecimalFormat;

public class BankAccount {

    private int accountId;
    private int balance;
    private static int accountCount;
    private static int countNumber;
    private int deposit;
    private int withdraw;

    public BankAccount() {
        accountId = ++accountCount;
        ++countNumber;
    }

    public void printAccount() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("▧ 계좌 " + countNumber + " | 계좌 ID : " + accountId + " | 잔액 : " + formatter.format(balance) + "원 ▧");
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public int getDeposit(int deposit) {
        balance += deposit;
        return balance;
    }

    public int getWithdraw(int withdraw) {
        balance -= withdraw;
        return balance;
    }

    public int getBalance() {
        return deposit - withdraw;
    }
}
