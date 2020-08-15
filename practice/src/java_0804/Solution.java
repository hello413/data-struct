package java_0804;

import java.util.Scanner;

public class Solution {
    public static void Dfs(int index, int n, int[] boxs, int[] book) {
        if (index == n + 1) {
            for (int i = 1; i <= n; i++)
                System.out.print(boxs[i] + " ");
            System.out.println();
            return; //向上回退
        }
        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) { //第i号牌仍在手上
                boxs[index] = i;
                book[i] = 1; //现在第i号牌已经被用了
                //处理下一个盒子
                Dfs(index + 1, n, boxs, book);
                //从下一个盒子回退到当前盒子，取出当前盒子的牌，
                //尝试放入其它牌。
                book[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] boxs = new int[n + 1];
        int[] books = new int[n + 1];
        Dfs(1, n, boxs, books);
    }
}
