package java_1015;

import java.util.Arrays;
import java.util.Scanner;

public class MJJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        for (int i:arr)
            System.out.print(i+" ");
    }
}
