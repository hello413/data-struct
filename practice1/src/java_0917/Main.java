package java_0917;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch>='1'&&ch<='3'){
                if (!isCharNum(i-1,line)&&isCharNum(i+1,line)&&isCharNum(i+2,line)
                        &&isCharNum(i+3,line)&&!isCharNum(i+4,line)){
                    System.out.print(line.substring(i,i+4)+" ");
                    i+=4;
                }
            }
        }
    }

    private static boolean isCharNum(int i,String line) {
        if (i>=line.length())return false;
        if (i<0)return false;
        char ch = line.charAt(i);
        if (ch>='0'&&ch<='9')
            return true;
        return false;
    }
}
