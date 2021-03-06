package java_0606;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (!stack2.isEmpty()){
            int temp = stack2.pop();
            stack1.push(temp);
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            int temp = stack1.pop();
            stack2.push(temp);
        }
        int result = stack2.pop();
        return result;
    }
}
