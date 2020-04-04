package java_0404;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    private int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = 0;
        for (int i = 0;i < postorder.length / 2 ; i++) {
            int temp = postorder[i];
            postorder[i] = postorder[postorder.length-1-i];
            postorder[postorder.length-1-i] = temp;
        }
        return buildTree(postorder,inorder,0,inorder.length);
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
        root.right=buildTree( preorder, inorder, pos + 1, right);
        root.left=buildTree(preorder,inorder,left,pos);
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
