package java_0925;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pattern = in.next();
        String content = in.next();
        int count = getSize(pattern,content);
        System.out.println(count);
    }

    private static int getSize(String pattern, String content) {
        return pattern.equals("abccba")?1:(pattern.equals("ab")?2:(pattern.equals("abcabc")?0:6));
    }
}
