package visitor.withVisitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil is shippied at 9$");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheel is shippied at 15$");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fender is shippied at 3$");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If more than 3 items are bought ... we will give discount on shipping");

        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is : " + shippingAmount);

    }

}
