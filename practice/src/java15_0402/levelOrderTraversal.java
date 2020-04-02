package java15_0402;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
      val = x;
    }
}

public class levelOrderTraversal {

    //层序
    public List<Integer> levelOrderTraversal(TreeNode root){
        List<TreeNode> tree = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        tree.add(root);
        while (tree.size()!=0){
            TreeNode first = tree.remove(0);
            list.add(first.val);
            if (first.left!=null){
                tree.add(first.left);
            }
            if (first.right!=null){
                tree.add(first.right);
            }
        }
        return list;
    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(TreeNode root){
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
                } else {
                    isfull = false;
                }
            }else {
                //第二阶段
                if (cur.left!=null||cur!=null){
                    return false;
                }
            }
        }
        return true;
    }
}
