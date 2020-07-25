package decorator;

public class DressingDecorator extends SandwichDecorator{

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String addDressing() {
        return " + mustard";
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }
}
