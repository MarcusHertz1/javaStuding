package code;

public class TestFunction {
    public static void main(String[] args) {
        /*info("Hello");
        String java = "Java";
        info(java);*/
        int a = 10;
        int res = sum(5, a);
        info(String.valueOf(res));
    }
    public static int sum (int a, int b) {
        int res = a + b;
        String result = "Res:" + res;
        info(result);
        return res;
    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }

}