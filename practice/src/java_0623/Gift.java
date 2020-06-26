package java_0623;

import java.util.HashMap;
import java.util.Map;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:gifts){
            int num = map.getOrDefault(i,0);
            map.put(i,++num);
            if (num>gifts.length/2){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int value = new Gift().getValue(new int[]{1, 2, 3, 2, 2}, 5);
        System.out.println(value);
    }
}
