package java_0809;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        int length = GetSize(str,m);
        System.out.println(length);
    }

    private static int GetSize(String str, int m) {
        //求连续m个数中出现字母最多的情况
        int n = str.length();
        int max= 0;
        for(int i=0;i<n-m;i++){
            int size = getMax(str.substring(i,i+m));
            if (size>max){
                max = size;
            }
        }
        return max;
    }

    //求字符串出现次数最多的字母次数
    private static int getMax(String substring) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i =0;i<substring.length();i++){
            char ch = substring.charAt(i);
            Integer de = map.getOrDefault(ch, 0);
            map.put(ch,de+1);
            if (de+1>max){
                max = de+1;
            }
        }
        return max;
    }
}
