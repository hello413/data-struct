package java_0413;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution02 {
    public boolean isCompleteTree(TreeNode root) {
        if (root==null){
            return true;
        }
        Queue<TreeNode> tree = new LinkedList<>();
        boolean isfull = true;
        tree.offer(root);
        while (!tree.isEmpty()){
            TreeNode cur = tree.poll();
            if (isfull) {
                //第一阶段
                if (cur.left != null && cur.right != null) {
                    tree.offer(cur.left);
                    tree.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    isfull = false;
                    tree.offer(cur.left);
                }else {
                    isfull=false;
                }
            }else {
                //第二阶段
                if (cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }
}
