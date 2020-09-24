package java_0923;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (n>m/2)
            n=m-n;
        BigInteger zi = new BigInteger(""+m);
//        long zi = m;
        for (int i=1;i<n;i++){
//            zi*=(m-i);
            zi = zi.multiply(new BigInteger(""+(m-i)));
        }
        BigInteger mu = new BigInteger(""+1);
        for (int i=2;i<=n;i++){
            mu = mu.multiply(new BigInteger(""+i));
        }
        BigInteger num = zi.divide(mu);
//        System.out.println(zi.toString());
//        System.out.println(mu.toString());
        System.out.println(num.toString());
    }
}
