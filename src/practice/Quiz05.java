package practice;

public class Quiz05 {
    public static void main(String[] args) {

        ProductOrder productOrder = new ProductOrder("노트북", 1000000, 2);
        ProductOrder productOrder1 = new ProductOrder("마우스", 15000, 3);
        ProductOrder productOrder2 = new ProductOrder("키보드", 50000,1 );

        productOrder.printProductInfo();
        productOrder1.printProductInfo();
        productOrder2.printProductInfo();

        int[] arr = {productOrder.totalPrice(), productOrder1.totalPrice(), productOrder2.totalPrice()};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("합계 : " + sum);
    }
}
