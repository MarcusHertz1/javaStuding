package code.hw13.T2;

/*
Написать класс с 3-мя методами, каждый из которых будет печатать по одной строчке
"Привет!", "Как дела?", "Что делаешь?\n" cоотвественно.
Вывести эту фразу в заданном выше порядке с помощью 3-х потоков и
синхронизации методов или блоков кода.
*/

public class T2 {

    static class Thread1 extends Thread{

        @Override
        public void run(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            str1();
        }
    }

    static class Thread2 extends Thread{

        @Override
        public void run(){
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            str2();

        }
    }

    static class Thread3 extends Thread{

        @Override
        public void run(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            str3();
        }
    }

    public static void str1() {
        System.out.println("hi!");
    }
    public static void str2() {
        System.out.println("how are u?");
    }
    public static void str3() {
        System.out.println("what u do?");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
