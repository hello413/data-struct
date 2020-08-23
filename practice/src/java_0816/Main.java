package java_0816;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        for (int i = 0;i<n;i++){
            preorder[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            inorder[i] = sc.nextInt();
        }
        TreeNode node = buildTree(preorder,inorder);
        int result = getTree(node);
        System.out.println(result);
    }

    private static int getTree(TreeNode node) {
        if (node==null){
            return 0;
        }
        if (node.left==null&&node.right==null){
            return 1;
        }
        return getTree(node.left)+getTree(node.right);
    }

    private static int index;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTree(preorder, inorder, 0, inorder.length);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder, int left, int right) {
        if (left >= right) {
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(inorder, left, right, root.val);
        root.left = buildTree(preorder, inorder, left, pos);
        root.right = buildTree(preorder, inorder, pos + 1, right);
        return root;
    }

    private static int find(int[] inorder, int left, int right, int val) {
        for (int i = left; i < right; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
