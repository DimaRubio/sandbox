package entity;

public class Customer {
    private final String name;
    int refund;

    public Customer(String name) {
        this.name = name;
    }

    public void refund(int price) {
        this.refund = price;
    }

    public int getRefunded() {
        return refund;
    }
}
