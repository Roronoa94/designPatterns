package abstractFactory;

public class AbstractFactoryCreditCardDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(500);

        CreditCard cardOne = abstractFactory.getCreditCard(CreditCardType.GOLD);
        cardOne.setNameOnCard("Kendrick");
        cardOne.setSecurityNumber(22341);
        cardOne.setValidityDate("April 2024");

        CreditCard cardTwo = abstractFactory.getCreditCard(CreditCardType.PLATINUM);
        cardTwo.setNameOnCard("JCole");
        cardTwo.setSecurityNumber(33401);
        cardTwo.setValidityDate("June 2024");

        CreditCardFactory anotherFactory = CreditCardFactory.getCreditCardFactory(1100);

        CreditCard cardThree = anotherFactory.getCreditCard(CreditCardType.GOLD);
        cardThree.setNameOnCard("Joyner");
        cardThree.setSecurityNumber(31012);
        cardThree.setValidityDate("April 2024");

        CreditCard cardFour = anotherFactory.getCreditCard(CreditCardType.PLATINUM);
        cardFour.setNameOnCard("Wayne");
        cardFour.setSecurityNumber(88901);
        cardFour.setValidityDate("May 2024");

        System.out.println(cardOne);
        System.out.println(cardTwo);
        System.out.println(cardThree);
        System.out.println(cardFour);
    }
}
