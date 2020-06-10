package java_0609;

import java.util.Scanner;

class Node{
    int key;
    Node next;
    public Node(int key){
        this.key=key;
    }
}

public class Main {
    static int size=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            if (n==0)continue;
            Node first = new Node(0);
            size=n;
            Node cur =first;
            for (int i=0;i<n-1;i++){
                first.key=i;
                first.next = new Node(i+1);
                first=first.next;
            }
            first.next = cur;
            while (size>1){
                first = first.next.next;
                first.next=first.next.next;
                size--;
            }
            System.out.println(first.key);
        }
    }
}
