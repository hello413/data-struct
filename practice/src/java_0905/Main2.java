package java_0905;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        for (int j=0;j<n;j++) {
            for (int i = 0; i < n - 2; i++) {
                if (arr[i] * arr[i+1] > arr[i + 1]*arr[i+2]) {
                    if (arr[i+1]>arr[i+2])
                        swap(arr, i, i + 2);
                    else swap(arr,i,i+1);
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
