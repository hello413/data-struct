package java_0624;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.nextLine();
            StringBuffer str = new StringBuffer(line);
            for (int i = 0 ;i<line.length();i++){
                char ch = line.charAt(i);
                if (ch<='E'&&ch>='A'){
                    str.setCharAt(i, (char) (ch+'V'-'A'));
                }else if (ch!=' '){
                    str.setCharAt(i, (char) (ch-5));
                }
            }
            System.out.println(str.toString());
        }
    }
}