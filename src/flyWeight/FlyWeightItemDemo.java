package flyWeight;

public class FlyWeightItemDemo {

    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();
        inventory.takeOrders("TV", 1234);
        inventory.takeOrders("TV", 1544);
        inventory.takeOrders("HeadPhone", 3256);
        inventory.takeOrders("Mobile", 3345);
        inventory.takeOrders("TV", 2231);
        inventory.takeOrders("HeadPhone", 9812);
        inventory.takeOrders("TV", 2314);
        inventory.takeOrders("HeadPhone", 8003);
        inventory.takeOrders("TV", 3902);
        inventory.takeOrders("Mobile", 5692);

        inventory.process();

        System.out.println(inventory.reportTotalNumberOfItemsMade());
    }

}
