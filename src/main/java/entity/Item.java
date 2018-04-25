package entity;

public class Item {
    private final String itemType;
    private int price = 0;

    public Item(String itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    public Item(String itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }
}
