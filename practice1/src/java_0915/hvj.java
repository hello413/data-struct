package java_0915;

class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

}
public class hvj {
    public static TreeNode lowestCommenAncestor2(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommenAncestor2(root.left,p,q);
        TreeNode right = lowestCommenAncestor2(root.right,p,q);
        if(left != null && right != null)
            return root;
        return left != null ? left : right;
    }

    public static void main(String[] args) {

    }
}
