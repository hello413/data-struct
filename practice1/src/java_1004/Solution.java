package java_1004;

import java.util.*;


public class Solution {
    /**
     * @param V：背包最大容量
     * @param C：价值
     * @param W：重量
     * @return
     */
    public static int getMaxValue(int V, int[] C, int[] W) {
        int num = C.length;
        if (V == 0 || num == 0)
            return 0;
        //多加一行一列，用于设置初始条件
        int[][] arr = new int[num + 1][V + 1];
        //初始化所有位置为0，第一行和第一列都为0，初始条件
        for (int i = 0; i < num + 1; i++) {
            arr[i][0] = 0;
        }
        for (int i = 0; i < V + 1; i++) {
            arr[0][i] = 0;
        }
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < V + 1; j++) {
                //第i个商品在A中对应的索引为i-1: i从1开始
                //如果第i个商品大于j,说明放不下， 所以(i,j)的最大价值和(i-1,j)相同
                if (W[i - 1] > j) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    //如果可以装下，分两种情况，装或者不装
                    //如果不装，则即为(i-1, j)
                    //如果装，需要腾出放第i个物品大小的空间： j - A[i-1],装入之后的最大价值即为(i - 1, j - A[i-1]) + 第i个商品的价值V[i - 1]
                    //最后在装与不装中选出最大的价值
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - W[i - 1]] + C[i - 1]);
                }
            }
        }
        //返回装入前N个商品，物品大小为m的最大价值
        return arr[num][V];
    }

    /*
        优化算法：
        上面的算法在计算第i行元素时，只用到第i-1行的元素，所以二维的空间可以优化为一维空间
        但是如果是一维向量，需要从后向前计算，因为后面的元素更新需要依靠前面的元素未更新（模拟二维矩阵的上一行的
        值）的值
    */

    /**
     * @param V：背包最大容量
     * @param C：价值
     * @param W：重量
     * @return
     */
    public static int getMaxValueII(int V, int[] C, int[] W) {
        // write your code here
        int num = C.length;
        if (V == 0 || num == 0)
            return 0;
//多加一列，用于设置初始条件，因为第一件商品要用到前面的初始值
        int[] maxValue = new int[V + 1];
//初始化所有位置为0，第一行都为0，初始条件
        for (int i = 0; i <= V; ++i) {
            maxValue[i] = 0;
        }
        for (int i = 1; i <= num; ++i) {
            for (int j = V; j > 0; --j) {
//如果第i个商品大于j,说明放不下， 所以(i,j)的最大价值和(i-1,j)相同
//如果可以装下，分两种情况，装或者不装
                //如果不装，则即为(i-1, j)
                //如果装，需要腾出放第i个物品大小的空间： j - A[i],装入之后的最大价值即为(i - 1, j - A[i-1]) + 第i个商品的价值V[i]
                //最后在装与不装中选出最大的价值
                if (W[i - 1] <= j) {
                    int newValue = maxValue[j - W[i - 1]] + C[i - 1];
                    maxValue[j] = Math.max(newValue, maxValue[j]);
                }
            }
        }
        //返回装入前N个商品，物品大小为m的最大价值
        return maxValue[V];
    }
}