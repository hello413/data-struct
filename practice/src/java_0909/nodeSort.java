package java_0909;

class Node{
    int val;
    Node next = null;
    public Node(int val){
        this.val=val;
    }
}

public class nodeSort {
    public static void main(String[] args) {
        Node a = new Node(15);
        Node b = new Node(45);
        Node c = new Node(8);
        Node d = new Node(23);
        Node e = new Node(37);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

    }
    public static void quickSort(Node head){

    }
    public static void mergeSort(Node head){        //归并
        
    }
}
