package builder;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("bread").condiment("condiment").meat("meat").dressing("dressing");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiment());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }

}