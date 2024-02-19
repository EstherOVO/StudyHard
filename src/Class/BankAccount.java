package Class;

import java.text.DecimalFormat;

public class BankAccount {

    String bankAcoount;
    String name;
    long deposit;
    long withdraw;
    long balance;

    BankAccount(String bankAcoount, String name) {
        this.bankAcoount = bankAcoount;
        this.name = name;
    }


    long getDeposit(int deposit) {
        balance += deposit;
        return balance;
    }

    long getWithdraw(int withdraw) {
        balance -= withdraw;
        return balance;
    }

    DecimalFormat formatter = new DecimalFormat("###,###");
    long getBalance() {
        if (withdraw > balance) {
            System.out.println("출금액이 잔액을 초과하였습니다. 다시 시도해 주시기를 바랍니다.");
        } else if (withdraw < balance) {
            balance = balance - withdraw;
            System.out.println("= 잔액은 " + formatter.format(balance) + "원입니다. =");
        }
        return balance;
    }
}
