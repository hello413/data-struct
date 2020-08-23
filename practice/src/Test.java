import java.util.ArrayList;
import java.util.List;

class A extends Thread{
    public boolean isR = true;
    public void run(){
        while (isR){
            System.out.println("1");
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends A{
    public String a;
    public String show(B obj){
        return "3";
    }
    public String show(A obj){
        return "4";
    }
    public static void d(){
    }
}

public class Test {

    public static void main(String[] args) throws InterruptedException {
        A a= new A();
        a.start();
        System.out.println("m");
        Thread.sleep(1000);
        System.out.println("a");
        a.isR=false;
    }

}
