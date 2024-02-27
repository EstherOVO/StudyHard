package interface00.ex02_1;

import java.text.DecimalFormat;

public class MobilePay implements Payment {

    @Override
    public void pay(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println(formatter.format(amount) + "원을 모바일로 결제합니다.");
    }
}
