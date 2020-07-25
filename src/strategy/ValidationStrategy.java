package strategy;

public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);

    protected boolean passesLuhn(String ccNumber) {
        return (ccNumber.length() % 2 == 0);
    }
}
