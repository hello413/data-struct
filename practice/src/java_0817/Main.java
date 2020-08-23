package java_0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[in.nextInt()][in.nextInt()];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int num = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                int temp = arr[i][0] + arr[j][0];
                for (int k = 1;k<arr[0].length;k++){
                    if (temp!=arr[i][k]+arr[j][k]){
                        break;
                    }
                    if (k==arr[0].length-1){
                        num++;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
