package java_0929;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for (int i =0;i<line.length;i++){
            if (line[i]!='('&&line[i]!='['&&line[i]!='{'&&line[i]!=')'&&line[i]!=']'&&line[i]!='}'){
                continue;
            }
            if (stack.isEmpty()){
                stack.push(line[i]);
                continue;
            }
            Character peek = stack.peek();
            if (map.containsKey(line[i])&&map.get(line[i])==peek){
                stack.pop();
            }else if (map.containsKey(line[i])&&map.get(line[i])!=peek){
                System.out.println(false);
                return;
            }else {
                stack.push(line[i]);
            }
        }
        boolean flag = stack.isEmpty()?true:false;
        System.out.println(flag);
    }
}
