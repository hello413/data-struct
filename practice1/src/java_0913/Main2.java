package java_0913;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        Long num = m*(3*n+1)*3*n;
        num/=2;
        System.out.println(num);
    }
}
