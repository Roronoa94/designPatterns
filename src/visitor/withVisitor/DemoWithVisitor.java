package visitor.withVisitor;

public class DemoWithVisitor {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();

        order.addPart(new Wheel());
        order.addPart(new Oil());
        order.addPart(new Fender());

        order.accept(new AtvPartsShippingVisitor());
        System.out.println("\n");
        System.out.println("\n");
        order.accept(new AtvPartsDisplayVisitor());
    }

}
