package strategy;

public class AmexStrategy extends ValidationStrategy{


    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("1") ||
                creditCard.getNumber().startsWith("0");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 4;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
