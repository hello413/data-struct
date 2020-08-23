package java_0822;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            if (flag(line)) {
                System.out.println("Accept");
            } else {
                System.out.println("Wrong");
            }
        }
    }

    private static boolean flag(String line) {
        String str = "[a-zA-Z]+\\d+\\w*";
        Pattern pattern= Pattern.compile(str);
        boolean matches = pattern.matches(str, line);
        return matches;
    }
}
