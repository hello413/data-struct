public class List {
    static class ListNode{
        private int val;
        private ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return null;
        ListNode prev=head;
        ListNode cur=prev.next;
        while (cur!=null){
            if (cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }else {
                prev=cur;
                cur=cur.next;
            }
        }
        if (head.val==val){
            head=head.next;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode NewHead=null;
        ListNode prev=head;
        ListNode cur=prev.next;
        head.next=null;
        while (cur!=null){
            ListNode next = cur.next;
            if (next==null){
                NewHead = cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return NewHead;
    }

    public ListNode middleNode(ListNode head) {
        int temp=size(head)/2;
        ListNode cur=head;
        for (int i=0;i<temp;i++){
            cur=cur.next;
        }
        return cur;
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head==null)
            return null;
        int size=size(head);
        ListNode cur=head;
        if (k>size){
            return null;
        }
        for (int i=1;i<size-k+1;i++){
            cur=cur.next;
        }
        return cur;
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode NewHead =new ListNode(-1);
        ListNode NewTail =NewHead;
        ListNode list1=l1;
        ListNode list2=l2;
        while(list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                NewTail.next=list1;
                list1=list1.next;
            }else {
                NewTail.next=list2;
                list2=list2.next;
            }
            NewTail=NewTail.next;
        }
        if (list1==null){
            NewTail.next=list2;
        }
        if (list2==null){
            NewTail.next=list1;
        }
        return NewHead.next;
    }

    public static ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;
        for (ListNode cur = head;cur!=null;cur=cur.next){
            if (cur.val>=x){
                bigTail.next=new ListNode(cur.val);
                bigTail=bigTail.next;
            }else {
                smallTail.next=new ListNode(cur.val);
                smallTail=smallTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallHead.next;
    }

    public static ListNode deleteDuplication(ListNode head) {
        ListNode NewHead = new ListNode(-1);
        ListNode NewTail = NewHead;
        ListNode cur = head;
        while (cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                NewTail.next=new ListNode(cur.val);
                NewTail=NewTail.next;
                cur=cur.next;
            }
        }
        return NewHead.next;
    }
    public static boolean chkPalindrome(ListNode head) {
        int size=size(head)/2;
        ListNode node=head;
        for (int i=0;i<size;i++){
            node=node.next;
        }
        ListNode prev = null;
        ListNode cur =node;
        while (cur!=null){
            ListNode next =cur.next;
            if (next==null){
                node=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while (node!=null){
            if (node.val!=head.val){
                return false;
            }
            node=node.next;
            head=head.next;
        }
        return true;
    }

    public static int size(ListNode head){
        int size=0;
        for (ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=size(headA),size2=size(headB);
        ListNode cur1=headA,cur2=headB;
        if (size1>size2){
            for (int i=0;i<size1-size2;i++){
                cur1=cur1.next;
            }
        }else {
            for (int i=0;i<size2-size1;i++){
                cur2=cur2.next;
            }
        }
        while (cur1!=null){
            if (cur1==cur2){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return null;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow =head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null&&fast.next!=null){

            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast==null||fast.next==null){
            return null;
        }
        ListNode cur1 =head;
        ListNode cur2 =fast;
        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=c;
        ListNode list = detectCycle(a);
       System.out.println(list.val);
//        for (ListNode cur=list;cur!=null;cur=cur.next){
//            System.out.println(cur.val);
//        }
    }
}
