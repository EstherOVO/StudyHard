package practice;

public class Quiz07 {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("물", 1000, 1);
        Item item2 = new Item("음료슈", 1000, 2);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItems();
        shoppingCart.totalPrice();
    }
}
