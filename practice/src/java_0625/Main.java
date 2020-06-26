package java_0625;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str1 = input.nextLine();
            String str2 = input.nextLine();
            StringBuffer strb1 = new StringBuffer(str1);
            StringBuffer strb2 = new StringBuffer(str2);
            for (char i:str2.toCharArray()){
                int index = strb1.indexOf(i+"");
                if (index==-1){
                    continue;
                }else {
                    strb1.deleteCharAt(index);
                    strb2.deleteCharAt(str2.indexOf(i+""));
                }
            }
            if (strb2.length()!=0){
                System.out.println("NO "+strb2.length());
            }else {
                System.out.println("YES "+strb1.length());
            }
        }
    }
}
