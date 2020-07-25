package strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        CreditCard amexCard1 = new CreditCard(new AmexStrategy());

        amexCard1.setNumber("1234");
        amexCard1.setDate("12/02/2020");
        amexCard1.setCvv("123");

        System.out.println("Is Amex " + amexCard1.getNumber() + " valid : " + amexCard1.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("2234");
        amexCard2.setDate("16/02/2020");
        amexCard2.setCvv("132");

        System.out.println("Is Amex " + amexCard2.getNumber() + " valid : " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("223412");
        visaCard.setDate("12/01/2020");
        visaCard.setCvv("321");

        System.out.println("Is Visa " + visaCard.getNumber() + " valid : " + visaCard.isValid());

    }

}
