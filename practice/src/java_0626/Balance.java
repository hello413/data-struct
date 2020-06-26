package java_0626;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Balance {
    boolean flag = true;
    public boolean isBalance(TreeNode root) {
        // write code here
        getLength(root);
        return flag;
    }
    public int getLength(TreeNode root){
        if(root == null) return 0;
        int left,right;
        left = right = 0;
        if(root.left != null)  left = getLength(root.left);
        if(root.right != null) right = getLength(root.right);
        if(left - right > 1 || right - left > 1) flag = false;
        return (left > right) ? left + 1 : right + 1;
    }
}
