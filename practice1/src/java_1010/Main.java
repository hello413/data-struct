package java_1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = lengthOfLastWord(in.nextLine());
        System.out.println(a);
    }

    private static int lengthOfLastWord(String s) {
        int end = s.length()-1;
        int length = 0;
        while (end>=0){
            char ch = s.charAt(end);
            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                length++;
            }else {
                if (length!=0)
                    break;
            }
            end--;
        }
        return length;
    }
}
