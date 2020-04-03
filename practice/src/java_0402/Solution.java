package java_0402;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return lists;
        }
        helper(root,0);
        return lists;
    }

    private void helper(TreeNode root, int level) {
        if (level==lists.size()){
            lists.add(new ArrayList<>());
        }
        //将当前节点填到合适位置
        lists.get(level).add(root.val);
        if (root.left!=null){
            helper(root.left,level+1);
        }
        if (root.right!=null){
            helper(root.right,level+1);
        }
    }
}
