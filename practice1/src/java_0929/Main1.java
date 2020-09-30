package java_0929;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = getN(m);
        System.out.println(n);
        System.out.println(Math.round((n-m)/2.0));
    }

    private static int getN(int m) {
        if (isHuiWen(m)){
            int temp = m/100+1;
            return temp*100+temp/10%10*10+temp/100;
        }
        if (m%10000/1000<m%100/10){
            int temp = m/100+1;
            return temp*100+temp/10%10*10+temp/100;
        }else{
            int temp = m/100;
            return temp*100+temp/10%10*10+temp/100;
        }
    }

    private static boolean isHuiWen(int m) {
        if (m/10000==m%10&&m%10000/1000==m%100/10){
            return true;
        }
        return false;
    }
}
