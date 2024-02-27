package interface00.ex02_2;

import java.text.DecimalFormat;

public class CreditCard extends Payment implements PaymentAble {

    public CreditCard(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println(formatter.format(amount) + "원을 신용 카드로 결제합니다.");
    }
}
