package abstractFactory;

public class AmexFactory extends CreditCardFactory{

    @Override
    public CreditCard getCreditCard(CreditCardType type) {

        switch(type) {
            case GOLD: {
                return new AmexGoldCreditCard();
            }
            case PLATINUM: {
                return new AmexPlatinumCreditCard();
            }
            default:{
                return null;
            }
        }
    }
}
