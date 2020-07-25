package visitor.withVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import visitor.withVisitor.AtvPart;

public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }


    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
