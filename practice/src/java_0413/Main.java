package java_0413;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String word =input.next().toUpperCase();
            String result = input.next().toUpperCase();
            Set<Character> chars = new LinkedHashSet<>();
            for (char ch: word.toCharArray()){
                chars.add(ch);
            }
            for (char ch: result.toCharArray()){
                chars.remove(ch);
            }
            String str = "";
            for (Character ch:chars){
                str+=ch;
            }
            str=str.toUpperCase();
            System.out.println(str);
        }
    }
}

