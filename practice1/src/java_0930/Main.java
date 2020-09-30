package java_0930;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(doStr(line));
    }

    private static String doStr(String str) {
        StringBuffer result = new StringBuffer();
        int sum = 1;
        char ch = str.charAt(0);
        for (int i=1;i<str.length();i++){
            if (ch == str.charAt(i))
                sum++;
            else {
                result.append(ch+"_"+sum+"_");
                sum = 1;
                ch=str.charAt(i);
            }
        }
        result.append(ch+"_"+sum);
        return result.toString();
    }
}
