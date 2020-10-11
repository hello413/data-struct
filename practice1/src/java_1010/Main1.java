package java_1010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
        int i = numOf(6, 3);
        System.out.println(i);
    }
    static int num = 0;
    public static int numOf(int n, int k){
        if (k==0)return 1;
        dfs(n,k,1);
        return num;
    }
    static List<Integer> tmp = new ArrayList<Integer>();
    private static void dfs(int n,int k, int start) {
        if(n<0||tmp.size()>k){
            return;
        }else if(n==0){
            for (int i:tmp){
                System.out.print(i+" ");
            }
            System.out.println();
            num++;
        }else{
            for(int i=start;i<=n;i++){
                tmp.add(i);
                dfs(n-i,k,i);
                tmp.remove((Integer)i);
            }
        }
    }
}
