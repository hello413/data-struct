package java_0902;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
   public List<Integer> p(TreeNode root,int x){
       List<List<Integer>> list = levelOrder(root,x);
       if (x<0||x>list.size()){
           return null;
       }
       return list.get(x-1);
   }
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root,int x) {
        if (root == null){
            return lists;
        }
        helper(root,0,x);
        return lists;
    }

    private void helper(TreeNode root, int level,int x) {
        if (level>x)
            return;
        if (level==lists.size()){
            lists.add(new ArrayList<>());
        }
        //将当前节点填到合适位置
        lists.get(level).add(root.val);
        if (root.left!=null) helper(root.left,level+1,x);
        if (root.right!=null)helper(root.right,level+1,x);
    }
}
