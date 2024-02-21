package static00;

public class BankAccount_Ex01 {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.getDeposit(10000);
        bankAccount1.getWithdraw(5000);
        bankAccount1.printAccount();

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.getDeposit(20000);
        bankAccount2.getWithdraw(7000);
        bankAccount2.printAccount();

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.getDeposit(15000);
        bankAccount3.getWithdraw(3000);
        bankAccount3.printAccount();

        System.out.println("▨ 전체 계좌 수 : " + BankAccount.getAccountCount() + "개");
    }
}
