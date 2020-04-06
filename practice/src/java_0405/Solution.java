package java_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    //debug测试用
    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    //非递归前序
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int a = stack.size();
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if (cur.right!=null){
                stack.push(cur.right);
            }
            if (cur.left!=null) {
                stack.push(cur.left);
            }
        }
        return list;
    }

    //非递归中序
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        if (root == null) {
            return list;
        }
        // 准备一个栈起到辅助效果
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true) {
            // 1. 循环往左找, 把路径上遇到的节点都入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // 2. 如果当前栈为空, 遍历就结束了
            if (stack.isEmpty()) {
                break;
            }
            // 3. 取栈顶元素并访问
            TreeNode top = stack.pop();
            list.add(top.val);

            // 4. 从当前节点的右子树再出发继续刚才的过程
            cur = top.right;
        }
        return list;
    }

    //非递归后序
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        // prev 记录了当前已经访问过的节点中的最后一个节点. (即将被访问的元素的前一个节点)
        TreeNode prev = null;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            // 拿出栈顶元素的值, 看看能不能访问
            TreeNode top = stack.peek();
            if (top.right == null || prev == top.right) {
                // 此时说明这个栈顶元素是可访问的.
                // 这个条件就对应了刚才写的 a) b) 这两个条件
                list.add(top.val);
                stack.pop();
                prev = top;  // 时刻维护好 prev 指向已经遍历完元素的最后一个.
            } else {
                cur = top.right;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode test = solution.build();
        solution.postorderTraversal(test);
    }
}
