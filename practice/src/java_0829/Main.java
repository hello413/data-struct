package java_0829;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int num=0;
        for (int i =0;i<arr.length;i++){
            int mei = arr[i];
            for (int j=0;j<arr.length;j++){
                if (i==j){
                    continue;
                }
                int tuan = arr[j];
                if (mei>tuan){
                    continue;
                }
                if (isSort(arr,mei,tuan,m)){
                    num++;
                }
            }
        }
        System.out.println(num);
    }

    private static boolean isSort(int[] arr, int mei, int tuan,int m) {
        int first = 0;
        for (int i=0;i<arr.length;i++){
            int x= arr[i];
            if (0<x&&x<mei||tuan<x&&x<m+1){
                if (first>arr[i]){
                    return false;
                }else {
                    first=arr[i];
                }
            }
        }
        return true;
    }
}
