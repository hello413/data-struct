package java_0915;

import java.util.*;

public class Main {
    private static Set<String> set = new TreeSet<>();

    public static void main(String[] args) {
        String str = "022";
        func(str.toCharArray(), 0);
        System.out.println(Arrays.toString(set.toArray()));
    }
    private static void swap(char[] charArray, int i, int j){
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
    private static void func(char[] charArray, int start){
        if (start == charArray.length - 1){
            set.add(new String(charArray));
        }else{
            for(int i = start; i <= charArray.length - 1; i ++){
                swap(charArray, start, i);
                func(charArray, start + 1);
                swap(charArray, start, i);
            }
        }
    }
}