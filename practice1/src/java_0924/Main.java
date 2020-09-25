package java_0924;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Main {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> preorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        List<TreeNode> li = new LinkedList<>();
        li.add(root);
        TreeNode cur = null;
        while(!li.isEmpty()){
            cur = li.remove(li.size()-1);
            list.add(cur.val);
            if(cur.right!=null)
                li.add(cur.right);
            if(cur.left!=null)
                li.add(cur.left);
        }
        return list;
    }

    public int couples (int month) {
        if (month==0)return 0;
        // write code here
        int first = 1;
        int second = 1;
        int third = 1;
        while(month-->2){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
