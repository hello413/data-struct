package java_1015;

class TreeNode1 {
    public String data;  //数据元素
    public TreeNode1 left, right;  //指向左，右孩子节点的链

    public TreeNode1() {
        this("?");//将问号做为值传入
    }

    public TreeNode1(String d) {
        data = d;
        left = right = null;
    }

    public void perorder(TreeNode1 p) {//每一次调用的节点都是根节点
        if (p != null) {
            System.out.print(p.data + " ");
            perorder(p.left);
            perorder(p.right);
        }
    }

    public void inorder(TreeNode1 p) {
        if (p != null) {
            perorder(p.left);
            System.out.print(p.data + " ");
            perorder(p.right);
        }
    }

    public void postorder(TreeNode1 p) {
        if (p != null) {
            perorder(p.left);
            perorder(p.right);
            System.out.print(p.data + " ");
        }
    }
}

//构造树
class Tree1 {
    protected TreeNode1 root;

    public Tree1(String perstr, String instr) {
        root = enter(perstr, instr);
    }
    public void postorderTraversal() {
        System.out.println("后根遍历");
        if (root != null) {
            root.postorder(root);
            System.out.println();
        }
    }

    public TreeNode1 enter(String prestr, String instr) {
        TreeNode1 p = null;
        int k, n;
        String first, presub, insub;
        n = prestr.length();
        if (n > 0) {
            first = prestr.substring(0, 1);
            // System.out.println("第一个元素为：" + first);
            p = new TreeNode1(first);
            k = instr.indexOf(first);
            //  System.out.println("k在中序遍历中的位置：" + k);
            presub = prestr.substring(1, k + 1);
            insub = instr.substring(0, k);
            p.left = enter(presub, insub);
            presub = prestr.substring(k + 1, n);
            insub = instr.substring(k + 1, n);
            p.right = enter(presub, insub);
        }
        return p;
    }
}


//测试类
public class s {
    public static void main(String[] args) {
        String prestr="ABCDEFG";
        String instr="DBCAFGE";
        if(args.length>1){
            prestr=args[0];
            instr=args[1];
        }
        Tree1 t1=new Tree1(prestr,instr);
        t1.postorderTraversal();
    }
}












