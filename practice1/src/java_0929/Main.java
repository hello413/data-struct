package java_0929;

public class Main {
    static class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        Node node1 = moveK(node, 2);
        for (Node cur = node1; cur != null; cur = cur.next) {
            System.out.print(cur.val + " ");
        }
    }

    public static Node moveK(Node node, int k) {
        if (node == null || k == 0)
            return node;
        Node cur = node;
        Node temp = null;
        int num = 0;
        while (cur != null) {
            num++;
            temp = cur;
            cur = cur.next;
        }
        k %= num;

        if (k == 0)
            return node;
        Node newH = node;
        for (int i = 0; i < num - k - 1; i++) {
            node = node.next;
        }
        cur = node.next;
        temp.next = newH;
        newH = cur;
        node.next = null;
        return newH;
    }

    public int beibao(int[] W, int[] P, int V) {
        int[][] arr = new int[W.length + 1][V + 1];
        int len = W.length;
        for (int i = 0; i < len + 1; i++) {
            arr[i][0] = 0;
        }
        for (int j = 0; j < V + 1; j++) {
            arr[0][j] = 0;
        }
        int sum = 0;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j < V + 1; j++) {
                arr[i][j] = arr[i - 1][j];
                if (W[i - 1] <= j) {
                    if (P[i - 1] + arr[i - 1][j - W[i - 1]] > arr[i - 1][j]) {
                        arr[i][j] = P[i - 1] + arr[i - 1][j - W[i - 1]];
                    }
                }
                sum++;
            }
        }
        return sum;
    }
}
