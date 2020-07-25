package visitor.withoutVisitor;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 3;
    }
}
