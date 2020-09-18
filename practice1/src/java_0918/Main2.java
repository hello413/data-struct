package java_0918;

import java.util.*;

public class Main2 {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        line = line.substring(1,line.length()-1);
        String[] split = line.split("],");
        Map<Integer,Node> map = new HashMap<>();
        Node head = null;
        for (String i:split){
            System.out.println(i);
            int mid = i.indexOf(",");
            System.out.println(i.substring(0,mid)+" "+i.substring(mid+1,i.length()));
            int f = Integer.valueOf(i.substring(0,mid));
            int s = Integer.valueOf(i.substring(mid+1,i.length()));
            Node first,second;
            if (!map.containsKey(f)) {
                first = new Node(f);
                if (map.size()==0)head=first;
                map.put(f,first);
            }else {
                first = map.get(f);
            }
            if (!map.containsKey(s)) {
                second = new Node(s);
                if (map.size()==0)head=first;
                map.put(s,second);
            }else {
                second = map.get(s);
            }
            first.next = second;
        }
        for (Node cur = head;cur!=null;cur=cur.next){
            System.out.print(cur.val+" ");
        }
    }
}
