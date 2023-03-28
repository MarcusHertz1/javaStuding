package code.hw9.T1;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String info() {
        return "Number: " + number + ", model: " + model + ", weight: " + weight;
    }

    public String receiveCall(String callerName) {
        return "Call: " + callerName;
    }

    public String receiveCall(String callerName, String callerNumber) {
        return "Call: " + callerName + " " + callerNumber;
    }

    public String getNumber(String callerNumber) {
        return " " + callerNumber;
    }

    public StringBuilder sendMessage(String... numbers) {
        StringBuilder result = new StringBuilder("Send this message to: ");
        for (String number : numbers) {
            result.append(number).append(", ");
        }
        return result;
    }

}
