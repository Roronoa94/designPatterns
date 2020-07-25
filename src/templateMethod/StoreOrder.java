package templateMethod;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("doing store checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("Processing payment in store");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter");
    }
}
