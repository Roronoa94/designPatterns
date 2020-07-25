package strategy;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("2") ||
                creditCard.getNumber().startsWith("3");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 6;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
