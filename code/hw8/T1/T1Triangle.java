package code.hw8.T1;

public class T1Triangle extends T1Figure {
    private int a;
    private int b;
    private int c;

    public T1Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T1Triangle() {
    }

    public int perimeter () {
        return a+b+c;
    }

    @Override
    public double calculateSquare() {
        double halfPer =  (double)perimeter () / 2;
        return Math.sqrt(halfPer*(halfPer-a)*(halfPer-b)*(halfPer-c));
    }
}
