package java_0404;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution01 {
    StringBuffer stringBuffer = new StringBuffer();
    public String tree2str(TreeNode t) {
        if (t==null){
            return "";
        }
        helper(t);
        stringBuffer.deleteCharAt(0);
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        return stringBuffer.toString();
    }

    private void helper(TreeNode t) {
        if (t==null){
            return;
        }
        stringBuffer.append("(");
        stringBuffer.append(t.val);
        helper(t.left);
        if (t.left==null&&t.right!=null){
            stringBuffer.append("()");
        }
        helper(t.right);
        stringBuffer.append(")");
    }
}
