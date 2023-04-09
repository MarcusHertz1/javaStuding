package code.hw13.T1;

/*
Создать три потока Т1, Т2 и Т3 (желательно разными способами),
которые в своём методе run будет печатать своё имя
Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1 (используя метод join)
*/

public class Task1 {

    static class T1 implements Runnable{

        @Override
        public void run(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello, I’m " + Thread.currentThread().getName());
        }
    }

    static class T2 implements Runnable{

        @Override
        public void run(){
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello, I’m " + Thread.currentThread().getName());

        }
    }

    static class T3 implements Runnable{

        @Override
        public void run(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello, I’m " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new T1(), "L");
        Thread t2 = new Thread(new T2(), "Le");
        Thread t3 = new Thread(new T3(), "Leo");

        try {
            t3.start();
            t3.join();
            t2.start();
            t2.join();
            t1.start();
            t1.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
