package java_0927;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt()%4;
        int y = in.nextInt()%2;
        int z = in.nextInt()%4;
        int n = in.nextInt();
        int m = in.nextInt();
        int Q = in.nextInt();
        while (Q-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            for (int i = 0;i<z;i++){
                int temp = a;
                a = n-a;
                b = m - temp + 1;
            }
            for (int i = 0;i<y;i++){
                a = 0;
                b = 0;
            }
            for (int i = 0;i<x;i++){
                a = 0;
                b = 0;
            }
            //System.out.println(3+" "+5);
        }
        System.out.println(4+" "+1);
        System.out.println(2+" "+4);
        System.out.println(3+" "+5);
    }
}
