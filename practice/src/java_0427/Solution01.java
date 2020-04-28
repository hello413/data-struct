package java_0427;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] arr = new int[queries.length];
        int[] wordarr = wordnum(words);
        for (int i = 0;i<queries.length;i++){
            int much = littlenums(queries[i]);
            int count = 0;
            for (int ch: wordarr){
                if (much<ch){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public int[] wordnum(String[] words){
        int[] arr = new int[words.length];
        int i = 0;
        for (String s:words){
            arr[i++] = littlenums(s);
        }
        return arr;
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
