package Java_0716;

import java.util.*;

public class LCA {
    private int n1;
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if(a>b) a/=2;
            else b/=2;
        }
        return a;
    }

    public static void main(String[] args) {
        int lca = new LCA().getLCA(2, 3);
        System.out.println(lca);
    }
}
