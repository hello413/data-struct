package java_0913;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[m];
            int pri = Integer.MAX_VALUE;
            for (int i =0;i<m;i++){
                int l = in.nextInt();
                int r = in.nextInt();
                int p = in.nextInt();
                if (p<pri)pri=p;
            }
            if (pri<=k) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
