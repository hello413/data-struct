package java_1013;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int buyCoke(int m, int a, int b, int c, int x) {
        if (m==0){
            return 0;
        }
        int money = 0;
        int first = 0,second = 0,third = 0;
        for (int i=0;money<x&&i<c;i++){
            first++;
            money+=100;
        }
        for (int i=0;money<x&&i<b;i++){
            second++;
            money+=50;
        }
        for (int i=0;money<x&&i<a;i++){
            third++;
            money+=10;
        }
        if (money>=x){
            c-=first;
            b-=second;
            a-=third;
            if (money>m){
                int num = money-m;
                b+=(num/50);
                a+=(num%50);
            }
        }else {
            return 0;
        }
        return first+second+third+buyCoke(m-1,a,b,c,x);
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _c;
        _c = Integer.parseInt(in.nextLine().trim());

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = buyCoke(_m, _a, _b, _c, _x);
        System.out.println(String.valueOf(res));

    }
}

