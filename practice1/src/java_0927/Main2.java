package java_0927;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int count = 0;
        for (int i =0;i<arr.length-2;i++){
            for (int j = i+1;j<arr.length-1;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (increase(arr,i,j,k)){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean increase(int[] arr, int i, int j, int k) {
        return arr[i]>arr[j]?false:(arr[j]>arr[k])?false:true;
    }
}
