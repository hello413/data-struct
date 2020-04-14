package java_0413;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            if (J.contains(ch+"")){
                num++;
            }
        }
        return num;
    }
}
