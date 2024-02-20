package Package;

import java.text.DecimalFormat;

public class ShoppingCart {

    Item[] items;
    int itemCount;

    public ShoppingCart() {
        this.items = new Item[10];
    }

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니는 10개까지만 담을 수 있습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("= 쇼핑 목록 = ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("· 상품명 : " + items[i].getName() + " | 가격 : " + formatter.format(items[i].getPrice()) + "원 | 수량 : " + formatter.format(items[i].getQuantity()) + "개");
        }

        int sum = 0;
        for (int j = 0; j < itemCount; j++) {
            sum += items[j].totalPrice();
        }
        System.out.println("▣ 최종 합계 : " + formatter.format(sum) + "원");
    }
}
