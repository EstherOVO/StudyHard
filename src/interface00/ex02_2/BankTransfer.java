package interface00.ex02_2;

import java.text.DecimalFormat;

public class BankTransfer extends Payment implements PaymentAble {

    public BankTransfer(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println(formatter.format(amount) + "원을 은행 이체로 결제합니다.");
    }
}
