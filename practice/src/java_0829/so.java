package java_0829;

import java.util.Scanner;

public class so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =in.nextInt();
        int t = in.nextInt();
        boolean[][] arr = new boolean[n][n];
        for (int i=0;i<n-1;i++){
            arr[in.nextInt()-1][in.nextInt()-1] = true;
        }
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (j==m||j==t){
                    break;
                }else if (arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
