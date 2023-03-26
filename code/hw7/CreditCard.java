package code.hw7;

public class CreditCard {
    private final String cardNumber;
    private int moneyAmount;

    public CreditCard(String cardNumber, int moneyAmount) {
        this.cardNumber = cardNumber;
        this.moneyAmount = moneyAmount;
    }

    public String cardInfo () {
        return "Card number: " + cardNumber + "\n" + "Value: " + moneyAmount + "\n";
    }

    public void moneyTransfer (int valMoneyTr) {
        moneyAmount += valMoneyTr;
    }

    public void cashWithdrawal (int valCardWd) {
        moneyAmount -= valCardWd;
    }

}
