package Package;

public class ShoppingCart_Ex03 {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("당근", 10000, 1);
        Item item2 = new Item("양파", 10000, 1);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        Item item3 = new Item("사과", 10000, 1);
        Item item4 = new Item("오렌지", 10000, 1);
        Item item5 = new Item("애호박", 10000, 1);
        Item item6 = new Item("대파", 10000, 1);
        Item item7 = new Item("미역", 10000, 1);
        Item item8 = new Item("시금치", 10000, 1);
        Item item9 = new Item("멸치", 10000, 1);
        Item item10 = new Item("어묵", 10000, 1);
        Item item11 = new Item("마라", 10000, 1);
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item5);
        shoppingCart.addItem(item6);
        shoppingCart.addItem(item7);
        shoppingCart.addItem(item8);
        shoppingCart.addItem(item9);
        shoppingCart.addItem(item10);
        shoppingCart.addItem(item11);

        shoppingCart.displayItems();
    }
}
