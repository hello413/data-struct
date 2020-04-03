package java_0402;

//class TreeNode {
//    char val;
//    TreeNode left;
//    TreeNode right;
//    public TreeNode(char x) {
//        val = x;
//    }
//}

import java.util.Scanner;

public class buildtree {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (input.hasNext()){
            String str = input.next();
            TreeNode head = buildtrees(str);
            inorder(head);
            System.out.println();
        }
    }

    private static void inorder(TreeNode head) {
        if (head==null){
            return;
        }
        inorder(head.left);
        System.out.print(head.val+" ");
        inorder(head.right);
    }

    private static int index = 0;
    private static TreeNode buildtrees(String str) {
        index = 0;
        return createtreeline(str);
    }

    private static TreeNode createtreeline(String str) {
        char ch = str.charAt(index);
        if (ch =='#'){
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left=createtreeline(str);
        index++;
        root.right=createtreeline(str);
        return root;
    }
}
