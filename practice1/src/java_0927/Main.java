package java_0927;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        while (q-->0){
            boolean flag = false;
            int x = in.nextInt();
            if (x<=arr[0]){
                System.out.println(arr[0]);
                continue;
            }
            for (int i = 1;i < n;i++){
                if (arr[i]>x){
                    if ((arr[i]-x)>=(x-arr[i-1]))
                        System.out.println(arr[i-1]);
                    else
                        System.out.println(arr[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(arr[n-1]);
        }
    }
}
