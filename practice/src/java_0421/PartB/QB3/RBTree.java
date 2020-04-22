package java_0421.PartB.QB3;

import java_0415.BinarySearchTree;

import java.util.*;

public class RBTree<T extends Comparable<T>> {

    public enum Colour {
        RED,
        BLACK;
    }

    public class Node<T extends Comparable<T>> {
        Colour colour;       // Node colour
        T value;             // Node value
        Node<T> parent;      // Parent node
        Node<T> left, right;        // Children nodes

        public Node(T value) {
            this.value = value;
            this.colour = Colour.BLACK;
            this.parent = null;

            // Initialise children leaf nodes
            this.left = new Node<T>();
            this.right = new Node<T>();
            this.left.parent = this;
            this.right.parent = this;
        }

        // Leaf node
        public Node() {
            this.value = null;
            this.colour = Colour.BLACK;
        }

        public void setColour(boolean isred) {
            this.colour = isred ? Colour.RED : Colour.BLACK;
        }
    }

    public Node<T> root; // The root node of the tree

    /**
     *  Initialize empty RBTree
     */
    public RBTree() {
        root = null;
    }

    // Check property 1
    public boolean testProp1() {
        // TODO: Implement this method
        // You are allowed to use any standard library
        // You may define additional helper methods to complete the task
         // remove this once you have implemented this method
        //null tree
        if (root==null){
            return true;
        }else if (!issort(root)) {
            return false;
        }else if (root.colour==Colour.RED){ //The root node is not black
            return false;
        }
        int count = 0;
        Node<T> cur = root;
        while (cur!=null){
            if (cur.colour==Colour.BLACK)
                count++;
            cur=cur.left;
        }
        int num = 0;
        return isbalance(root, count, num);
    }

    private boolean isbalance(Node<T> cur, int count, int num) {
        if (cur==null){
            return true;
        }
        //Continuous red node
        if (cur.colour==Colour.RED && cur.parent.colour==Colour.RED){
            return false;
        }
        if (cur.colour==Colour.BLACK){
            num++;
        }
        if (cur.left==null&&cur.right==null){
            if (num!=count){
                return false;
            }
        }
        return isbalance(cur.left,count,num)&&isbalance(cur.right,count,num);
    }

    private boolean issort(Node root){
        List<Node> list = inOrderNode(root);
        for (int i = 0;i<list.size()-1;i++){
            if (list.get(i).value.compareTo(list.get(i+1).value)>0){
                return false;
            }
        }
        return true;
    }

    public List<Node> inOrderNode(Node root) {
        List<Node> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
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
            Node top = stack.pop();
            if (top.value!=null) {
                list.add(top);
            }
            // 4. 从当前节点的右子树再出发继续刚才的过程
            cur = top.right;
        }
        return list;
    }

    // Check property 2
    public boolean testProp2() {
        // TODO: Implement this method
        // You are allowed to use any standard library
        // You may define additional helper methods to complete the task
        if (root==null){
            return true;
        }else if (!issort(root)) {
            return false;
        }else if (root.colour==Colour.RED){ //The root node is not black
            return false;
        }
        Map<Node,Integer> map = new HashMap<>();
        List<Node> list = inOrderNode(root);
        for (Node node:list){
            if (node!=root && node.colour==Colour.RED&&node.parent.colour==Colour.RED){
                return false;
            }
            map.put(node,getleft(node));
        }
        for (Node node:list){
            if (map.get(node)!=getright(node)){
                return false;
            }
        }
        return true; // remove this once you have implemented this method
    }

    private Integer getleft(Node cur) {
        int count=0;
        while (cur!=null){
            if (cur.colour==Colour.BLACK)
                count++;
            cur=cur.left;
        }
        return count;
    }

    private Integer getright(Node cur) {
        int count=0;
        while (cur!=null){
            if (cur.colour==Colour.BLACK)
                count++;
            cur=cur.right;
        }
        return count;
    }

    /**
     * Base class for node with link to the parent
     *
     * @param <T> data type
     */

    /**
     * Add a new node into the tree with {@code root} node.
     * @param root Node<T> The root node of the tree where x is being inserted.
     * @param x Node<T> New node being inserted.
     */
    private void insertRecurse(Node<T> root, Node<T> x){
        if (root.value.compareTo(x.value) > 0) {
            if (root.left.value == null) {
                root.left = x;
                x.parent = root;
            } else {
                insertRecurse(root.left, x);
            }
        } else if (root.value.compareTo(x.value) < 0) {
            if (root.right.value == null) {
                root.right = x;
                x.parent = root;
            } else {
                insertRecurse(root.right, x);
            }
        }
        // Do nothing if the tree already has a node with the same value.
    }

    /**
     * Insert node into RBTree.
     * Note that for checking properties, we do not need to have a complete RB tree.
     * Here the insertion is the same as the binary tree.
     *
     * @param x Node<T> The new node being inserted into the tree.
     */
    private void insert(Node<T> x) {
        // Insert node into tree
        if (root == null) {
            root = x;
        } else {
            insertRecurse(root, x);
        }
    }

    /**
     * Demo functions
     * (Safely) insert a value into the tree
     * @param value T The value of the new node being inserted.
     */
    public void insert(T value) {
        Node<T> node = new Node<T>(value);
        if (node != null)
            insert(node);
    }

    /**
     *  Return the corresponding node of a value, if it exists in the tree
     * @param x Node<T> The root node of the tree we search for the value {@code v}
     * @param v Node<T> The node that we are looking for
     * @return
     */
    private Node<T> find(Node<T> x, T v) {
        if (x.value == null)
            return null;

        int cmp = v.compareTo(x.value);
        if (cmp < 0)
            return find(x.left, v);
        else if (cmp > 0)
            return find(x.right, v);
        else
            return x;
    }

    /**
     * Returns a node if the value of the node is {@code key}.
     *
     * @param key T The value we are looking for
     * @return
     */
    public Node<T> search(T key) {
        return find(root, key);
    }

}