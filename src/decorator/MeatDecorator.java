package decorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String addMeat() {
        return " + chicken";
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }
}
