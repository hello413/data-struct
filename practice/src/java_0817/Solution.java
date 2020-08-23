package java_0817;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m=in.nextInt();
        while (n!=0){
            if (is(n)){
                if (n==1){
                    System.out.print(m);
                }
                n--;
            }
            m++;
        }
    }

    private static boolean is(int n) {
        int flag = 0;
        double a = Math.sqrt(n);
        for(int i = 2;i <= a;i++){
            if(n % i == 0)
                flag = -1;
        }
        if(flag ==0 )
            return true;//不是素数
        else
            return false;
    }
}
