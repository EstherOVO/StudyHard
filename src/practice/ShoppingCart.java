package practice;

public class ShoppingCart {

    private Item[] items;
    private int itemCount;

    public ShoppingCart() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("= 장바구니 목록 =");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + " | 가격 : " + items[i].getPrice() + "원 | 수량 : " + items[i].getQuantity() + "개");
        }
    }

    public void totalPrice() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getSum();
        }
        System.out.println("총 가격 : " + sum);
    }
}
