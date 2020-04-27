package java_0426;

public class Solution {
    public Character findTheDifference(String s, String t) {
        char res = 0;
        int lens = s.length();
        for (int i = 0; i < lens; i ++) {
            res ^= s.charAt(i)^ t.charAt(i);
        }
        res ^= t.charAt(lens);
        return res;
    }
}
