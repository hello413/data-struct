package java_0823;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
public class Main2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        ListNode node =  head.next.next;
        node.next = new ListNode(5);
        node.next.next = new ListNode(4);
        System.out.println(head.toString());
    }
}
