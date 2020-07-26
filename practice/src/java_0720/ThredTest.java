package java_0720;

public class ThredTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("线程1");
        });
        Thread t1 = new Thread(() -> {
            System.out.println("线程2");
        });
        t1.start();
        t.run();
        t.run();
        t.run();
        s();
    }

    public static void s() throws InterruptedException {
        Thread.sleep(200L);
        System.out.println("ss");
    }
}
