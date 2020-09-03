package java_0830;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, -1},
                {3, 4, -5},
                {1, -2, 4},
                {1,-2,-3}
        };
        int result = fib(arr);
        System.out.println(result);
    }

    /**
     * 第一行和第二行上的最大的子矩阵是什么呢？就是第一行与第二行的和
     * 求他们的最大子数组就是第一行和第二行的最大子矩阵
     * @param arr
     * @return
     */
    private static int fib(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            int[] help=new int[arr[0].length];
            for (int j=i;j<arr.length;j++){
                for (int k=0;k<arr[0].length;k++){
                    help[k]+=arr[j][k];
                }
                max=max<maxSum(help)?maxSum(help):max;
            }
        }
        return max;
    }
    //先查一个一维数组最大子数组和
    public static int maxSum(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int cur=0;
        for (int i=0;i<arr.length;i++){
            cur+=arr[i];
            max=Math.max(max,cur);
            cur=cur<0?0:cur;
        }
        return max;
    }
    public static int source_row = -1,source_col = -1,edge_row = -1,edge_col = -1;
    private static int fibs(int[][] arr) {
        /*
         * 依次循环每行每列的每个数据项
         * 寻找每个数据项能组成的子矩阵之和
         * 更新赋值m和n分别为每次计算行列的边界
         * 即每次计算a[i][j] 从i~m行,j~n列的子矩阵的和
         * */
        int sum = arr[0][0],sum_temp = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                int m = i,n = j;
                while(m < arr.length){
                    while(n < arr[0].length){
                        for(int k = i;k <= m;k++){
                            for(int l = j;l <= n;l++){
                                sum_temp = sum_temp + arr[k][l];
                            }
                        }
                        if(sum_temp > sum){
                            sum = sum_temp;
                            source_row = i+1;
                            source_col = j+1;
                            edge_row = m+1;
                            edge_col = n+1;
                        }

                        sum_temp = 0;
                        n++;
                    }
                    m++;
                    n = j;  // 重置m边界
                }
            }
        }

        System.out.println("\n" + "最大子矩阵的和为：" + sum);
        System.out.println("\n" + "最大子矩阵的起点为：" + source_row + "行" + source_col + "列" + "\n"
                +"边界为：" + edge_row + "行" + edge_col + "列");
        return sum;
    }
}
