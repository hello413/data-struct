package java_0604;

import org.junit.Test;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        boolean b = chkParenthesis("(()(())", 7);
        System.out.println(b);
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<n;i++){
            Character ch = A.charAt(i);
            if (!ch.equals('(')&&!ch.equals(')')){
                return false;
            }else if(ch.equals('(')){
                stack.push('(');
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty()?true:false;
    }
}
