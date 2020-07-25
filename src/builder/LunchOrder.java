package builder;

public class LunchOrder {

    public static class Builder {

        private String meat;
        private String condiment;
        private String dressing;
        private String bread;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiment(String condiment) {
            this.condiment = condiment;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String meat;
    private final String condiment;
    private final String dressing;
    private final String bread;

    private LunchOrder (Builder builder) {
        this.meat = builder.meat;
        this.condiment = builder.condiment;
        this.dressing = builder.dressing;
        this.bread = builder.bread;
    }

    public String getBread() {
        return bread;
    }

    public String getDressing() {
        return dressing;
    }

    public String getCondiment() {
        return condiment;
    }

    public String getMeat() {
        return meat;
    }

}
