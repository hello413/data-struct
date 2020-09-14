package java_0912;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        FindPath(root, target, stack, result);
        return result;
    }

    private void FindPath(TreeNode root, int target, Stack<Integer> stack, ArrayList<ArrayList<Integer>> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i : stack) {
                    list.add(i);
                }
                list.add(root.val);
                result.add(list);
            }
        } else {
            stack.push(root.val);
            FindPath(root.left, target - root.val, stack, result);
            FindPath(root.right, target - root.val, stack, result);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(4);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(11);
        head.left.left.left = new TreeNode(7);
        head.left.left.right = new TreeNode(2);
        head.left.left.left.left = new TreeNode(8);
        head.left.left.right.left = new TreeNode(7);
        head.left.left.right.right = new TreeNode(10);
        head.right.left = new TreeNode(13);
        head.right.right = new TreeNode(4);
        head.right.right.left = new TreeNode(5);
        head.right.right.left.left = new TreeNode(6);
        head.right.right.right = new TreeNode(1);
        ArrayList<ArrayList<Integer>> lists = new Solution().FindPath(head, 35);
        for (ArrayList<Integer> i:lists){
            System.out.println(i);
        }
    }
}