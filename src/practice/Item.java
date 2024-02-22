package practice;

public class Item {

/*
    연습문제5 : 장바구니
    Item 클래스와 ShoppingCart 클래스를 설계하세요.

    요구사항
    ===
    Item 클래스와 ShoppingCart 클래스는 다른 패키지에서도 사용 가능해야 합니다.
    ShoppingCart에는 상품(Item 객체)을 최대 10개까지만 담을 수 있습니다.
    10개 초과하여 상품을 추가하려고 하면, "장바구니가 가득 찼습니다."를 출력합니다.

    메인 메소드로 실행할 경우 다음과 같은 결과를 출력합니다.

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 2000, 5);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }

    실행결과
    ===
    장바구니 상품 출력
    상품명:당근, 합계:4500
    상품명:양파, 합계:10000
    전체 가격 합:14500


    Hint
    ===
    Item 클래스의 필드 String name, int price, int quantity
    ShoppingCart 클래스의 필드 Item[] items, int itemCount
*/

    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSum() {
        int sum = 0;
        sum = quantity * price;
        return sum;
    }
}
