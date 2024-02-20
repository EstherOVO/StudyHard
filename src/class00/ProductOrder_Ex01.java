package class00;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductOrder_Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("주문하실 물건의 총개수를 말씀해 주세요 : ");
        int productNumber = scanner.nextInt();;

        ProductOrder[] orders = new ProductOrder[productNumber];

        for (int i = 0; i < orders.length; i++) {
            System.out.print("상품명 : ");
            String productName = scanner.next();
            System.out.print("금액 : ");
            int productPrice = scanner.nextInt();
            System.out.print("주문 수량 : ");
            int productQuantity = scanner.nextInt();

            orders[i] = createProduct(productName, productPrice, productQuantity);
        }

        System.out.println("======= 확인란 =======");
        printProductInfo(orders);

        DecimalFormat fommater = new DecimalFormat("###,###");
        int finalTotalPrice = totalPrice(orders);
        System.out.println("▣ 최종 금액은 \"" + fommater.format(finalTotalPrice) + "원\"입니다. ▣");
    }

    public static int totalPrice(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

    public static void printProductInfo(ProductOrder[] orders) {
        DecimalFormat fommater = new DecimalFormat("###,###");
        for (ProductOrder order : orders) {
            System.out.println("■ 상품명 : " + order.name + "\n■ 상품 가격 : " + fommater.format(order.price) + "원" + "\n■ 주문 수량 : " + fommater.format(order.quantity) + "개");
            System.out.println("=====================");
        }
    }

    public static ProductOrder createProduct(String productName, int productPrice, int productQuantity) {
         ProductOrder productOrder = new ProductOrder();
         productOrder.name = productName;
         productOrder.price = productPrice;
         productOrder.quantity = productQuantity;
         return productOrder;
    }
}