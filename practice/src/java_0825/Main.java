package java_0825;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node{
        int val;
        Node left = null;
        Node right = null;
        public Node(int val){ this.val = val; }
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(1);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right = new Node(7);
        ArrayList<ArrayList<Integer>> list = getList(root);
        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> getList(Node root) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node poll = queue.poll();
                list.add(poll.val);
                if (poll.left!=null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
