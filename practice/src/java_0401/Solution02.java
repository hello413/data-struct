package java_0401;

import java.util.Stack;

public class Solution02 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for (String s : ops){
            switch (s){
                case "+":
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first+second);
                    num+=(first+second);
                    break;
                case "D":
                    int temp = 2*stack.peek();
                    num+=(temp);
                    stack.push(2*stack.peek());
                    break;
                case "C":
                    num-=(stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    num+=Integer.parseInt(s);
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution02 solution02 =new Solution02();
        String[] s ={"5","2","C","D","+"};
        solution02.calPoints(s);
    }
}
