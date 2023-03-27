package code.hw8.T1;

public class T1Rectangle extends T1Triangle {
    private int a;
    private int b;

    public T1Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public T1Rectangle() {
    }

    public int perimeter() {
        return a + b + a + b;
    }

    public double calculateSquare() {
        return a*b;
    }
}
