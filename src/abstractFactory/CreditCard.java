package abstractFactory;

public abstract class CreditCard {

    private String nameOnCard;
    private int securityNumber;
    private String validityDate;

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }
}
