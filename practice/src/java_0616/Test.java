package java_0616;

import org.junit.Assert;

class Node{
    public static int x=0;
    public static void s(){
        System.out.println("hello");
    }
    public void Node(){
        
    }
}

public class Test {
    public static void main(String[] args) {
        Node node = new Node();
        node.x = 1;
        Node.x = 2;
        node.s();
        Node.s();
        System.out.println(node.x+"----"+Node.x);
    }
}
