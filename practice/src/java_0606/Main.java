package java_0606;

import java.util.Scanner;

public class Main {
    static int count;
    public static void beibao(int[] nums,int s,int n){
        if(s == 0){
            count++;
            return;
        }
        if(s<0||(s>0&&n<0)){
            return;
        }
        beibao(nums,s-nums[n],n-1);
        beibao(nums,s,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0;i<N;i++){
            nums[i] = sc.nextInt();
        }
        beibao(nums,40,N-1);
        System.out.println(count);
    }
}
