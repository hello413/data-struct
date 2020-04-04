package java_0403;

public class Solution01 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        // 基于递归的方式来完成双向链表构建. 为了保证有序性, 需要中序遍历.
        // 二叉搜索树的中序遍历结果是有序.
        if (pRootOfTree ==null ||(pRootOfTree.left == null && pRootOfTree.right == null)) {
            return pRootOfTree;
        }
        // 最终的链表 => 左子树的链表 + 根节点 + 右子树的链表
        // 就需要用左子树链表的尾巴和根节点相连.
        // 在用右子树的头部和根节点相连.

        // 1. 先递归处理左子树.
        // left 就是左子树这个链表的根节点
        TreeNode left = Convert(pRootOfTree.left);
        // 2. 需要找到左子树链表的尾节点
        TreeNode leftTail = left;
        // right 相当于链表的 next
        while (leftTail!=null&&leftTail.right!=null){
            leftTail = leftTail.right;
        }
        if (left!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right!=null){
            right.left = pRootOfTree;
            pRootOfTree.right=right;
        }
        return left==null?pRootOfTree:left;
    }
}
