package java_1013;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int validateArrayUsages(String[] lines) {
        int size = Integer.parseInt(lines[0].substring(lines[0].indexOf("[")+1,lines[0].indexOf("]")));
        int[] arr = new int[size];
        for (int i=1;i<lines.length;i++){
            String str = lines[i];
            if (getError(str,size,arr)==-1){
                return i+1;
            }
        }
        return 0;
    }

    private static int getError(String str, int size, int[] arr) {
        Stack<Character> stack = new Stack<>();
        int left=0,right=0;
        int len = str.length();
        while (left<len&&right<len){
            left = str.indexOf("[");
            right = str.indexOf("]");
            if (left<0||right<0){
                break;
            }
            int index = Integer.parseInt(str.substring(left+1,right));
            if (index>size){
                return -1;
            }
            str=str.substring(left,right);
        }
        return 0;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _lines_size = 0;
        _lines_size = Integer.parseInt(in.nextLine().trim());
        String[] _lines = new String[_lines_size];
        String _lines_item;
        for(int _lines_i = 0; _lines_i < _lines_size; _lines_i++) {
            try {
                _lines_item = in.nextLine();
            } catch (Exception e) {
                _lines_item = null;
            }
            _lines[_lines_i] = _lines_item;
        }

        res = validateArrayUsages(_lines);
        System.out.println(String.valueOf(res));

    }
}

