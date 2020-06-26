package java_0623;


class ListNode {
    int val;
    ListNode next = null;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null||pHead.next==null){
            return pHead;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode smailTail = smallHead;
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        for (ListNode cur = pHead;cur!=null;cur=cur.next){
            if (cur.val<x){
                smailTail.next = new ListNode(cur.val);
                smailTail = smailTail.next;
            }else {
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            }
        }
        smailTail.next = bigHead.next;
        return smallHead.next;
    }
}
