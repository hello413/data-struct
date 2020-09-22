package java_0919;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer has = new StringBuffer(in.next());
        StringBuffer need = new StringBuffer(in.next());
        int size = 0;

        for (int i =0;i< need.length();i++){
            String ch = need.charAt(i)+"";
            if (has.toString().contains(ch)){
                has.deleteCharAt(has.toString().indexOf(ch));
                size++;
            }
        }

        System.out.println(size);
    }
}
