package abstractFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int CreditScore) {

        if (CreditScore < 650) {
            return new VisaFactory();
        }
        else {
            return new AmexFactory();
        }
    }

    public abstract CreditCard getCreditCard(CreditCardType type);

}
