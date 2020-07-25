package visitor.withVisitor;

public interface AtvPartVisitor {

    void visit(Oil oil);
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(PartsOrder partsOrder);
}
