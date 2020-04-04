package java_0403;

public class Solution02 {
    private int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTree(preorder,inorder,0,inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int left, int right) {
        if (left>=right){
            return null;
        }
        if (index>=preorder.length){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(inorder,left,right,root.val);
        root.left=buildTree(preorder,inorder,left,pos);
        root.right=buildTree( preorder, inorder, pos + 1, right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int val) {
        for (int i = left;i<right;i++){
            if (inorder[i]==val){
                return i ;
            }
        }
        return -1;
    }
}
