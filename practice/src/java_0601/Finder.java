package java_0601;

import java.util.Arrays;

public class Finder {
    public static void main(String[] args) {
        System.out.println(findKth(new int[]{1,3,5,2,2},5,3));
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        return a[K-1];
    }
}
