package Java_0728;

import java.util.*;

public class Solution {
    public void Swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public boolean IsExist(ArrayList<String> result, char[] str) {
        return result.contains(String.valueOf(str));
    }

    public void PermutationHelper(char[] str, int start, ArrayList<String> result) {
        if (start == str.length - 1) {
            if (!IsExist(result, str)) {
                result.add(new String(str));
            }
            return;
        }
        for (int i = start; i < str.length; i++) {
            Swap(str, start, i);
            PermutationHelper(str, start + 1, result);
            Swap(str, start, i);
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, result);
            Collections.sort(result);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> abc = new Solution().Permutation("abc");
        for (String i:abc){
            System.out.println(i);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.poll();
        Stack stack = new Stack();
        stack.push(1);
        stack.pop();
    }
}