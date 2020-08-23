package java_0821;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static int size = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char[][] arr = new char[N][N];
        for (int i= 0;i<N;i++){
            String line = in.next();
            for (int j=0;j<N;j++){
                arr[i][j] = line.charAt(j);
            }
        }
        for (int i= 0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j]=='C'){
                    getSize(1,i,j,arr);
                }
            }
        }
        System.out.println(size);
    }
    static int[][] temp = {{-1,0},{1,0},{0,-1},{0,1}};
    private static void getSize(int index, int i, int j, char[][] arr) {
        if (index==5){
            size++;
            return;
        }
        char ch ="CHINA".charAt(index);
        for (int k = 0;k<temp.length;k++){
            if (i+temp[k][0]<0||i+temp[k][0]>=arr.length||j+temp[k][1]<0||j+temp[k][1]>=arr.length){
                continue;
            }
            char arrch = arr[i+temp[k][0]][j+temp[k][1]];
            if (arrch==ch){
                getSize(index+1,i+temp[k][0],j+temp[k][1],arr);
            }
        }
    }
}
