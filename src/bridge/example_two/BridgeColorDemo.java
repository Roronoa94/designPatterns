package bridge.example_two;

public class BridgeColorDemo {

    public static void main(String[] args) {

        Color red = new Red();
        Color blue = new Blue();

        Shape circle = new Circle(red);
        circle.applyColor();

        Shape square = new Square(red);
        square.applyColor();

        Shape blueCircle = new Circle(blue);
        blueCircle.applyColor();
    }
}
