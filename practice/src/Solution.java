import java.util.Scanner;

public class Solution {
    // 存储每次分割的值
    static int[] arr;
    static int num;
    public static void main(String[] args) {
        // 分割的值最多分成1+1+...+1 最多就是他本身的长度
        Scanner input = new Scanner(System.in);
        num =input.nextInt();
        arr = new int[num];
        search(num,1,0);
    }

    /**
     * 计算
     * @param n 需要计算的数
     * @param s 需要拆分的最小数
     * @param x 分割存储的下标
     */
    private static void search(int n, int s, int x) {
        // 当需要计算的数大于0的时候才开始计算
        if(n>0) {
            for(int i=s;i<=n;i++) {
                // 存储本次分割出的值
                arr[x]=i;
                // 计算分割剩余的值 同时存储的下标+1
                search(n-i,i,x+1);
            }
            return;
        }
        System.out.print(num+"="+arr[0]);
        // 循环把分割出来的数组拼接
        for(int i=1;i<x;i++) {
            System.out.print("+"+arr[i]);
        }
        //换行
        System.out.println();
    }
}
