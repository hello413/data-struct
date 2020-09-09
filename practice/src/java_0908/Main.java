package java_0908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.next();
        char[][] arr= {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for (int j =0;j<arr[0].length;j++){
                if (arr[i][j]=='S'){
                    flag = getFlag(arr,i,j,str,1);
                }
                if (flag){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(flag);
    }

    static int[][] temp = {{-1,0},{0,-1},{0,1},{1,0}};
    private static boolean getFlag(char[][] arr, int row, int col, String str, int index) {
        if (index==str.length()){
            return true;
        }
        boolean flag = false;
        char c = str.charAt(index);
        for (int i=0;i<temp.length;i++){
            int newRow = temp[i][0]+row;
            int newCol = temp[i][1]+col;
            if (newCol<0||newCol>3||newRow<0||newRow>2){
                continue;
            }
            if (arr[newRow][newCol]==c){
                flag = getFlag(arr, newRow, newCol, str, index+1);
            }
            if (flag){
                return true;
            }
        }
        return flag;
    }
}
