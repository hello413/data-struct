package java_0912;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = getLongth(str);
        System.out.println(num);
    }

    private static int getLongth(String str) {
        char[] arr = {'a','b','c','x','y','z'};
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0,state = 0;
        for (int i=0;i<str.length();i++){
            for (int j = 0;j<arr.length;j++){
                if (str.charAt(i)==arr[j])
                    state^=1<<j;
            }
            map.putIfAbsent(state,i);
            max = Math.max(max,i-map.get(state));
        }
        return max;
    }
}
