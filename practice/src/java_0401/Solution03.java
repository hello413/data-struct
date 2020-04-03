package java_0401;

import java.util.Stack;

public class Solution03 {
    public boolean backspaceCompare(String S, String T) {
        return StackedString(S).equals(StackedString(T));
    }
    public String StackedString(String S){
        Stack<String> stack = new Stack<>();
        char[] s = S.toCharArray();
        for (char i:s){
            if (i=='#'&&!stack.isEmpty()){
                stack.pop();
                continue;
            }
            if (i=='#'){
                continue;
            }
            stack.push(i+"");
        }
        String result = "";
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution03 solution03 =new Solution03();
        solution03.backspaceCompare("y#fo##f","y#f#o##f");
    }
}
