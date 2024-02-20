package package00;

public class Item {

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
        if (price >= 0) {
            this.price = price;
        }
        return price;
    }

    public int getQuantity() {
        if (price >= 0) {
            this.price = price;
        }
        return quantity;
    }

    public int totalPrice() {
        return price * quantity;
    }
}
