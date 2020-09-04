package java_0903;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int m = 2;
        int num = fib(n,m);
        System.out.println(num);
    }

    private static int fib(int n, int m) {
        int count = 0;
        for (int i =0;i<=m;i++){
            for (int j =1;j<=m;j++){
                if (i+j==n&&i!=j){
                    count++;
                }
            }
        }
        return count;
    }
}
