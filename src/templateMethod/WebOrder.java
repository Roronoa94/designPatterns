package templateMethod;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("doing web checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("Processing payment on web");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("calculateShipping item to address");
    }
}
