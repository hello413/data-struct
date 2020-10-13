package java_1013;

public class Test {
    static class Node{
        int a = 0;
    }
    private volatile static Node a = null;
    public static Node getInst() {
        if (a==null){
            synchronized (Test.class){
                if (a==null){
                    a=new Node();
                }
            }
        }
        return a;
    }
}
