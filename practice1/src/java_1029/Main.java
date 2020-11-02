package java_1029;
import java.util.*;
public class Main {
    private static List<Integer> list=new LinkedList<>();
    static class RunnableA implements Runnable{
        public void run(){
            while(true){
                if(list.size()>0){
                    System.out.println(list.remove(0));
                }
            }
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for(int i=0;i<10;i++){
            new Thread(new RunnableA()).start();
        }

    }

}
