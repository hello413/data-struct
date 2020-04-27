package java_0427;

class MyHashMap {
    class Node{
        int key;
        int value;
        Node next;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private Node[] array;
    private double size;
    private double FACTOR = 0.75;
    /** Initialize your data structure here. */
    public MyHashMap() {
        array= new Node[11];
    }
    public MyHashMap(int length){
        array= new Node[length];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key%array.length;
        for (Node cur = array[index];cur!=null;cur=cur.next){
            if (cur.key==key){
                cur.value=value;
                return;
            }
        }
        Node node = new Node(key, value);
        node.next=array[index];
        array[index] = node;
        size++;
        if (size/array.length>=FACTOR){
            falsharr();
        }
    }

    private void falsharr() {
        Node[] newArr = new Node[2*array.length];
        for (int i = 0; i<array.length;i++){
            for (Node cur = array[i];cur!=null;cur=cur.next){
                int index = cur.key%newArr.length;
                Node node = new Node(cur.key,cur.value);
                node.next=newArr[index];
                newArr[index] = node;
            }
        }
        array=newArr;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = key%array.length;
        for (Node cur = array[index];cur!=null;cur=cur.next){
            if (cur.key==key){
                return cur.value;
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = key%array.length;
        Node node = array[index];
        if (node==null){
            return;
        }
        if (node!=null&&node.key==key){
            array[index]=node.next;
            size--;
            return;
        }
        Node prev = node;
        for (Node cur = node.next;cur!=null;cur=cur.next){
            if (cur.key==key){
                prev.next=cur.next;
                size--;
                return;
            }
            prev=prev.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 2);
        hashMap.put(4, 2);
        hashMap.put(5, 2);
        hashMap.put(11, 2);
        hashMap.put(22, 3);
        hashMap.put(33, 4);
        hashMap.put(44, 5);
        hashMap.put(6, 2);
        hashMap.put(7, 2);
        hashMap.put(8, 2);
        System.out.println(hashMap.size+"------"+hashMap.array.length);
        hashMap.put(9, 2);
        System.out.println(hashMap.size+"------"+hashMap.array.length);
        hashMap.put(10, 2);
        hashMap.put(12, 2);
        hashMap.put(0, 0);
        hashMap.put(55, 5);
        hashMap.put(77, 5);
        hashMap.put(11, 2);
        hashMap.put(11, 2);
        hashMap.remove(33);
        hashMap.put(13, 2);
        hashMap.put(14, 2);hashMap.put(15, 2);hashMap.put(16, 2);
        hashMap.put(17, 2);hashMap.put(18, 2);hashMap.put(19, 2);hashMap.put(20, 2);
        hashMap.get(1); // 返回 1
        hashMap.get(3);// 返回 -1 (未找到)
        hashMap.put(2, 1);  // 更新已有的值
        hashMap.get(2); // 返回 1
        hashMap.remove(2);  // 删除键为2的数据
        hashMap.get(2);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
