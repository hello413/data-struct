package java_0420;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        return issamehelp(s,t)&&issamehelp(t,s);
    }

    private boolean issamehelp(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i<s.length();i++){
            char index1 = s.charAt(i);
            char index2 = t.charAt(i);
            if (map.get(index1)==null){
                map.put(index1,index2);
            }else {
                if (map.get(index1)!=index2){
                    return false;
                }
            }
        }
        return true;
    }
}
