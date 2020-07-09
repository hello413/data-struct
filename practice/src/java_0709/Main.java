package java_0709;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n,jia_win=0,jia_ping=0,jia_lose=0,yi_win=0,yi_ping=0,yi_lose=0;
        int jia_win_c=0,jia_win_j=0,jia_win_b=0,yi_win_c=0,yi_win_j=0,yi_win_b=0,jia_win_max=0,yi_win_max=0;
        String a,b,c,d;
        for(int i=1; i<=N; i++){
            a = in.next();b = in.next();
            if(a.equals("C")&&b.equals("J"))//甲赢
            {
                jia_win++;
                yi_lose++;
                jia_win_c++;
            }
            if(a.equals("J")&&b.equals("B"))//甲赢
            {
                jia_win++;
                yi_lose++;
                jia_win_j++;
            }
            if(a.equals("B")&&b.equals("C"))//甲赢
            {
                jia_win++;
                yi_lose++;
                jia_win_b++;
            }
            if(a.equals("J")&&b.equals("C"))//乙赢
            {
                jia_lose++;
                yi_win++;
                yi_win_c++;
            }
            if(a.equals("B")&&b.equals("J"))//乙赢
            {
                jia_lose++;
                yi_win++;
                yi_win_j++;
            }
            if(a.equals("C")&&b.equals("B"))//乙赢
            {
                jia_lose++;
                yi_win++;
                yi_win_b++;
            }
            if(a.equals("C")&&b.equals("C"))//平
            {
                jia_ping++;
                yi_ping++;
            }
            if(a.equals("J")&&b.equals("J"))//平
            {
                jia_ping++;
                yi_ping++;
            }
            if(a.equals("B")&&b.equals("B"))//平
            {
                jia_ping++;
                yi_ping++;
            }
        }
        //求甲最大的获胜手势
        if(jia_win_b>=jia_win_c)
        {
            if(jia_win_b>=jia_win_j)
                c="B";
            else
                c="J";
        }else{
            if(jia_win_c>=jia_win_j)
                c="C";
            else
                c="J";
        }
        //求乙最大的获胜手势
        if(yi_win_b>=yi_win_c)
        {
            if(yi_win_b>=yi_win_j)
                d="B";
            else
                d="J";
        }else{
            if(yi_win_c>=yi_win_j)
                d="C";
            else
                d="J";
        }
        System.out.println(jia_win+" "+jia_ping+" "+jia_lose);
        System.out.println(yi_win+" "+yi_ping+" "+yi_lose);
        System.out.println(c+" "+d);
    }
}