package xiaomi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] vv = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vv[i][j] = in.nextInt();
            }
        }
        int result = num(vv);
        System.out.println(result);
    }

    private static int num(int[][] vv) {
        int ans = 0;
        for (int i = 0; i < vv.length; i++) {
            for (int j = 0; j < vv[i].length; j++) {
                if (vv[i][j] == 1){
                    ans++;
                    dfs(vv,i,j);
                }
            }
        }
        return ans;
    }

    private static void dfs(int[][] vv, int i, int j) {
        if (i < 0||i == vv.length || j < 0||j == vv[i].length || vv[i][j] == 0) return;
        vv[i][j] = 0;
        int[] di = {0,0,1,-1};
        int[] dj = {1,-1,0,0};

        for (int k = 0; k < 4; k++) {
            dfs(vv,i+di[k],j+dj[k]);
        }
        return;
    }
}
