package interface00.ex02_2;

import java.text.DecimalFormat;

public class MobilePay extends Payment implements Payable {

    public MobilePay(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println(formatter.format(amount) + "원을 모바일로 결제합니다.");
    }
}
