package java_0601;

import java.util.Arrays;

public class Finder {
    public static void main(String[] args) {
        System.out.println(findKth(new int[]{1,3,5,2,2},5,3));
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        quicksorthelp(a,0,n);
        return a[K];
    }

    private static void quicksorthelp(int[] a, int left, int right) {
        if (left>=right){
            return;
        }
        int index = paintition(a,left,right);
        quicksorthelp(a,left,index-1);
        quicksorthelp(a,index+1,right);
    }

    private static int paintition(int[] a, int left, int right) {
        int begin = left;
        int end = right;
        int temp =a[right];
        while (begin<end){
            while (begin<end&&a[begin]>=temp){
                begin++;
            }
            while (begin<end&&a[begin]<=a[end]){
                end--;
            }
        }
    }
}
