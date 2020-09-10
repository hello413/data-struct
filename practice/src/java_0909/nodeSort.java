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
        Node node = mergeSort(a);
        while (node!=null){
            System.out.print(node.val+",");
            node=node.next;
        }
    }
    public static Node mergeSort(Node head){        //归并
        if (head==null||head.next==null)return head;
        Node left = head;
        Node mid = getMidNode(head);
        Node right = mid.next;
        mid.next = null;
        return mergeSortHelp(mergeSort(left),mergeSort(right));
    }

    private static Node mergeSortHelp(Node left, Node right) {
        Node newHead = new Node(-1);
        Node newTail = newHead;
        while (left!=null&&right!=null){
            if (left.val<right.val){
                newTail.next = left;
                left = left.next;
            }else {
                newTail.next = right;
                right = right.next;
            }
            newTail = newTail.next;
        }
        if (left!=null)newTail.next = left;
        if (right!=null)newTail.next = right;
        return newHead.next;
    }

    private static Node getMidNode(Node head) {
        if (head==null||head.next==null)return head;
        int len = 0;
        Node cur = head;
        for (;cur!=null;cur=cur.next)len++;
        for (int i =0;i<(len-1)/2;i++)
            head = head.next;
        return head;
    }
}
