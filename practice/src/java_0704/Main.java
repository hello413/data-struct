package java_0704;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 大整数排序
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n=input.nextInt();
            BigInteger[] bg = new BigInteger[n];
            for(int i = 0; i<n; i++)
                bg[i] = input.nextBigInteger();
            Arrays.sort(bg);//Java中Arrays的排序静态方法调用即可完成
            for(int i=0; i<n; i++) System.out.println(bg[i]);
        }
    }
}