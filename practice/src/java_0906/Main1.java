package java_0906;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i= 0;i<n;i++){
            if (i<n/2) System.out.println(arr[n/2]);
            else System.out.println(arr[n/2-1]);
        }
    }
}
