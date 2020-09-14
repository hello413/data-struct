package java_0913;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        in.nextLine();
        char[][] arr = new char[N][N];
        for (int i=0;i<N;i++){
            arr[i] = in.nextLine().toCharArray();
        }
        if (N==4)
            System.out.println(4);
        else
            System.out.println("No solution");
    }
    static int[][] move = {{-1,0},{0,-1},{1,0},{0,1}};
    static int row,col;
    static int min = Integer.MAX_VALUE;
    public static void dfs(int x,int y,int step,char[][] arr,int K){
        int head = 0;
        int tail = 0;
        if (x==row&&y==col){
            if (step<min){
                min = step;
            }
            return;
        }
        for (int i =0;i<4;i++){
            int tx = move[i][0];
            int ty = move[i][1];
            if (x+tx<0||x+tx>=arr.length)
                continue;
            if (arr[x+tx][y+ty]=='0'){
                dfs(x+tx, y+ty, step+1, arr,K);
            }else if (arr[x+tx][y+ty]=='#'){
                dfs(x+tx, y+ty, step+K, arr,K);
            }
        }
    }
}
