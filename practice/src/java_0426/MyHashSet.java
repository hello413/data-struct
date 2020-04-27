package java_0426;

class MyHashSet {
    class Node{
        int key;
        Node next;
        public Node(int key){
            this.key=key;
        }
    }
    Node[] arr;
    /** Initialize your data structure here. */
    public MyHashSet(int length) {
        arr = new Node[length];
    }

    public void add(int key) {
        int index = key%arr.length;
        for(Node cur = arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                return;
            }
        }
        Node node = new Node(key);
        node.next = arr[index];
        arr[index] = node;
    }

    public void remove(int key) {
        int index = key%arr.length;
        Node list = arr[index];
        if (list==null){
            return;
        }
        if(list.key==key&&list.next==null){
            arr[index] = null;
            return;
        }
        Node perv = null;
        Node cur = list;
        for(;cur!=null;cur=cur.next){
            if(cur.key==key){
                perv.next=cur.next;
                return;
            }
            perv=cur;
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = key%arr.length;
        for(Node cur = arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //*["MyHashSet","add","remove","add","contains","add","remove","add","add","add","add"]
        //[[],[6],[4],[17],[14],[14],[17],[14],[14],[18],[14]]

        MyHashSet hashSet = new MyHashSet(10);
        hashSet.add(6);
        hashSet.remove(4);
        hashSet.add(17);
        hashSet.contains(14); // 返回 true
        hashSet.add(14);
        hashSet.remove(17);
        hashSet.add(14);hashSet.add(14);hashSet.add(18);hashSet.add(14);

    }
}

