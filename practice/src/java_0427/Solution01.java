package java_0427;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution01 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> list = new ArrayList<>();
        int num = mucharrnum(words);
        for (int i = 0;i<queries.length;i++){
            int much = littlenums(queries[i]);
            if (much<num){
                list.add(i+1);
            }
        }
        int[] arr = new int[list.size()];
        for (int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

    public int mucharrnum(String[] words){
        int mach = 0;
        for (String s:words){
            int num = littlenums(s);
            if (num>mach){
                mach = num;
            }
        }
        return mach;
    }

    public int littlenums(String s){
        int much = 0;
        char str = s.charAt(0);
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if (ch<str){
                str=ch;
            }
        }
        return map.get(str);
    }
}
