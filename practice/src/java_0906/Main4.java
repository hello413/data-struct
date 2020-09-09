package java_0906;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.01;
        double c = a - b;
        System.out.println(c);
        BigDecimal d = new BigDecimal("0.03");
        BigDecimal e = new BigDecimal("0.01");
        BigDecimal f = d.subtract(e);
        System.out.println(f);
    }
}
