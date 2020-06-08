package java_0605;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //while(input.hasNext()){
            String str1 = input.nextLine();
            String str2 = input.nextLine();
            StringBuffer str = new StringBuffer(str1);
            for (char i:str2.toCharArray()){
                while (str.toString().contains(i+"")) {
                    str.deleteCharAt(str.indexOf(i + ""));
                }
            }
            System.out.println(str.toString());
        //}They are students.
        //aeiou
    }
}
