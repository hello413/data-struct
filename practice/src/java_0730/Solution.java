package java_0730;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] arr = new boolean[s.length() + 1];
        arr[0] = true;
        for (int i = 1; i <= s.length(); ++i) {
            for (int j = i - 1; j >= 0; --j) {
                String s1=s.substring(j,i);
                if (arr[j] && dict.contains(s.substring(j, i))) {
                    arr[i] = true;
                    break;
                }
            }
        }
        return arr[s.length()];
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("leet");
        set.add("code");
        boolean leetcode = new Solution().wordBreak("leetcode", set);
        System.out.println(leetcode);
    }
}