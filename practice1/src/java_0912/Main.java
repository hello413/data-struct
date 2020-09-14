package java_0912;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static class Node{
        int val;
        Node left = null;
        Node right = null;
        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Node head = null;
        Map<Integer,Node> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            int par = in.nextInt();
            String style = in.next();
            int cur = in.nextInt();
            if (!map.containsKey(par)){
                map.put(par,new Node(par));
                head = map.get(par);
            }
            Node node = map.get(par);
            map.put(cur,new Node(cur));
            if (style.equals("left")){
                node.left = map.get(cur);
            }else if (style.equals("right")){
                node.right = map.get(cur);
            }
        }
        print(head);
        System.out.println(num);
    }
    static int num = 0;
    private static void print(Node head) {
        if (head==null){
            return;
        }
        if (isNullNode(head.left)&&isNullNode(head.right)){
            num++;
        }
        print(head.left);
        print(head.right);
    }
    public static boolean isNullNode(Node root){
        if (root!=null&&root.left==null&&root.right==null){
            return true;
        }
        return false;
    }
}
