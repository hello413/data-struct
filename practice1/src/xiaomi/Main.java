package xiaomi;

import java.util.*;


class TreeNode {
   int val = 0;
   TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val){
        this.val = val;
    }
  }


public class Main {
    /**
     *
     * @param node TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        if (!queue.isEmpty()){
            int len = queue.size();
            ArrayList<Integer> list = new ArrayList<>(len);
            for (int i = 0; i < len; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.right!=null) queue.offer(poll.right);
                if (poll.left!=null) queue.offer(poll.left);
            }
            result.add(list);
        }

        return result;
     }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);
        ArrayList<ArrayList<Integer>> lists = printNode(root);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}