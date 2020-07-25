package decorator;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new MeatDecorator(new DressingDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }

}
