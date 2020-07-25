package visitor.withoutVisitor;

import visitor.withoutVisitor.AtvPart;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
