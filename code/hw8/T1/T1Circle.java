package code.hw8.T1;

public class T1Circle extends T1Rectangle {

    private final int r;

    public T1Circle(int r) {
        this.r = r;
    }

    public int perimeter() {
        return (int) (Math.PI * r * 2);
    }

    public double calculateSquare() {
        return Math.PI * r * r;
    }
}
