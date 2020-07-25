package flyWeight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrders(String itemName, int  orderNumber) {
        Item item = catalog.lookUp(itemName);
        orders.add(new Order(item, orderNumber));
    }

    public void process() {
        for(Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    public String reportTotalNumberOfItemsMade() {
        return "Total number of items made : " + catalog.totalItemsMade();
    }

}
