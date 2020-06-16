package java_0616;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.round(1.5));
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String num1 = input.nextLine();
            String num2 = input.nextLine();
            BigInteger n1=new BigInteger(num1);
            BigInteger n2=new BigInteger(num2);
            System.out.println(n1.add(n2));
        }
    }
}
