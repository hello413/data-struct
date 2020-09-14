package java_0913;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String password = in.nextLine();
        String result = "";
        for (int i = 0; i < password.length(); i += n) {
            String str = "";
            if (i + n < password.length()) str = password.substring(i, i + n);
            else str = password.substring(i, password.length());
            result += (new StringBuffer(str).reverse().toString());
        }
        System.out.println(result);
    }
}
