package code.hw7;

public class CreditCard {
    private int numberOfCard;
    private String cardNumber;
    private int val;

    public CreditCard(int numberOfCard, String cardNumber, int val) {
        setValues(numberOfCard, cardNumber, val);
    }

    public void setValues (int numberOfCard, String cardNumber, int val) {
        this.numberOfCard = numberOfCard;
        this.cardNumber = cardNumber;
        this.val = val;
    }

    public String cardInfo () {
        return "CC" + numberOfCard + "\n" + "Card number: " + cardNumber + "\n" + "Value: " + val + "\n";
    }

    public int moneyTransfer (int valMoneyTr) {
        return 0;
    }

    /*public int cashWithdrawal (int valCardWd) {
        int newValWd -= valCardWd;
        return newValWd;
    }*/

}
