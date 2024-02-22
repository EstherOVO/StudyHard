package practice;

public class ProductOrder {

/*
    상품 주문 클래스 만들기

    ProductOrder 클래스를 생성하고,
    상품명, 가격, 주문수량 필드를 만든다.
    productName, price, quantity

    상품, 가격, 수량을 3개 담아서
    총 결제금액을 계산하는 프로그램을 만들어보세요.

    실행 결과
    ===
    주문 상품 정보:
    상품명: 노트북, 가격: 1000000원, 수량: 2개
    상품명: 마우스, 가격: 15000원, 수량: 3개
    상품명: 키보드, 가격: 50000원, 수량: 1개
    총 결제 금액: 2065000원
*/

    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProductInfo() {
        System.out.println("상품명 : " + productName + " | 가격 : " + price + " | 수량 : " + quantity);
    }

    public int totalPrice() {
        return price * quantity;
    }
}
