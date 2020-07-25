package state;

public class StateFanDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);
        fan.pullChain();

        System.out.println(fan);
        fan.pullChain();

        System.out.println(fan);
        fan.pullChain();

        System.out.println(fan);
        fan.pullChain();

        System.out.println(fan);
    }

}
