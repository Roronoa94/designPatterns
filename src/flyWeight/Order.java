package flyWeight;

public class Order {

    private final Item item;
    private final int orderNumber;

    public Order(Item item, int orderNumber) {
        this.item = item;
        this.orderNumber = orderNumber;
    }

    public void processOrder() {
        System.out.println("Taking order for " + this.item + " which has order number " + this.orderNumber);
    }

}
