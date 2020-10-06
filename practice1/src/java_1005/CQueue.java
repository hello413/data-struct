package java_1005;

import java.util.Stack;

public class CQueue {

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public void appendTail(int value) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int deleteHead() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        CQueue c = new CQueue();
        c.appendTail(3);
        c.deleteHead();
        c.deleteHead();
        System.out.println(c.stack1);
        System.out.println(c.stack2);
    }
}
