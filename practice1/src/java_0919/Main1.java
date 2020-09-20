package java_0919;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        char[][] arr = new char[M][N];
        printfArr(arr);
        for (int i=0;i<M;i++){
            for (int j =0;j<N;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void printfArr(char[][] arr) {
        int style = 0;
        int M = arr.length;
        int N = arr[0].length;
        for (int i=0,row = 0,clo=0;i<=M*N;i++){
            System.out.println(row+"---"+clo);
            arr[row][clo] = (char)('A'+i%26);
            if (row+clo==M-1&&row>N/2){
                style=1;
            }
            if (row+clo==M-1&&row<M/2){
                style=3;
            }
            if (row==clo&&row>N/2){
                style=2;
            }
            if (clo-row==1&&row<N/2){
                style=0;
            }
            switch (style){
                case 0:
                    row++;
                    break;
                case 1:
                    clo++;
                    break;
                case 2:
                    row--;
                    break;
                case 3:
                    clo--;
                    break;
            }
        }
    }
}
