package java_0805;

import java.util.LinkedList;
import java.util.Queue;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}


public class test {
    public static ListNode insertSortList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode root = new ListNode(0);//来记录头结点
        root.next = head;
        ListNode prevNode = head;//这个是用来作为我们遍历无序链表的前继节点
        ListNode orderPrev ;//这个用来存储排序完成的链表的前继节点

        ListNode cur;
        while(prevNode != null && prevNode.next != null){
            if(prevNode.val < prevNode.next.val){//这样的比较就是为了要找到比前继节点大的当前的节点
                prevNode = prevNode.next;
            }else{
                cur = prevNode.next;//如果找到的话，我们需要保存当前节点
                prevNode.next = cur.next;//用来保存当前的值的下一个节点，是为了使得下次循环可以实现
				/*
					下面开始进行插入元素
				*/
                orderPrev = root;
                while(orderPrev.next.val < cur.val){
                    orderPrev = orderPrev.next;
                }
                /**
                 当找到前继节点以后，注意在链表中怎么才能原地插入元素。
                 */
                cur.next = orderPrev.next;
                orderPrev.next = cur;
            }
        }
        return root.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(0);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        ListNode head = insertSortList(l1);

        while(head != null){
            System.out.printf(head.val+" ");
            head = head.next;
        }
    }

}
