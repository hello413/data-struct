package java_0908;

public class Main1 {
    static int a = 0;
    int b = 0;

    public synchronized static void test() {
        a++;
    }

    public void test1() {
        b++;
    }

    public static void main(String[] args) throws InterruptedException {
        Main1 m = new Main1();
        for (int i = 0; i < 10000; i++) {
            synchronized (m) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //m.test();
                        m.test1();
                    }
                }).start();
            }
        }
        while (Thread.activeCount() > 3) {
            Thread.yield();
        }
        System.out.println(m.a + " " + m.b);
    }
}
