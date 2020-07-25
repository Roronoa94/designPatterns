package abstractFactory;

public class VisaFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CreditCardType type) {

        switch(type) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case PLATINUM: {
                return new VisaPlatinumCreditCard();
            }
            default:{
                return null;
            }
        }
    }
}
