package java_0403;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    private TreeNode lca =null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        findlca(root,p,q);
        return lca;
    }

    private boolean findlca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        int left = findlca(root.left,p,q)?1:0;
        int right = findlca(root.right,p,q)?1:0;
        int mid = (root==p||root==q)?1:0;
        if (left+right+mid==2){
            lca=root;
        }
        return left+right+mid>0;
    }
}
