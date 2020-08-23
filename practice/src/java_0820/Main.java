package java_0820;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String line = in.nextLine();
//            String line = " ds   dsad ";
//            System.out.println(getLine(line));
//        }
        Random random = new Random();
        System.out.println(random.nextInt(111111));
        int c= (int) (Math.random()*1111);
        System.out.println(c);
    }

    private static String getLine(String line) {
        line = line.replaceAll("\\s+"," ");
        StringBuffer sb = new StringBuffer(line);
        return sb.toString().trim();
    }
}
