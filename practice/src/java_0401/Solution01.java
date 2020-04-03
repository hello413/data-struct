package java_0401;

import java.util.Stack;
public class Solution01 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0){return false;}
        Stack<Integer> s = new Stack<Integer>();//辅助栈，用于模拟压栈和出栈
        int popIndex = 0;//出栈序列的索引，默认从第一位开始
        for(int i = 0;i < pushA.length;i++){
            s.push(pushA[i]);
            while(!s.empty() && s.peek() == popA[popIndex]){
                //弹出栈顶
                s.pop();
                //指针后移一位，进行下一轮比较
                popIndex++;
            }
        }
        return s.empty();
    }
}
