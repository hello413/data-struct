package java_1106;

public class Main {
    volatile static Integer list=0;

    public static void main(String[] args) {
        Main main = new Main();
        for (int i =0;i<3;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        synchronized (main){
                            if (list>5){
                                try {
                                    list.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            list++;
                            System.out.println(Thread.currentThread().getName()+"让其加1------"+list);
                            list.notifyAll();
                        }
                    }
                }
            }).start();
        }
        for (int i =0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        synchronized (main){
                            if (list<0){
                                try {
                                    list.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            list--;
                            System.out.println(Thread.currentThread().getName()+"让其减1------"+list);
                            list.notifyAll();
                        }
                    }
                }
            }).start();
        }
    }
}
