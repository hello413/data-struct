package java_0420;

public class Solution03 {
    public int firstUniqChar(String s) {
        s=s.toLowerCase();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}
