package java_0911;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][2];
        int index = 0;
        boolean flag = true;
        for (int i =0;i<m;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            if (flag&&arr[i][1]==0){
                flag = false;
                index = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =1;i<=n;i++)list.add(i);
        for (int i=1;i<m-1;i++){
            if (list.contains(Integer.valueOf(arr[i][0])))list.remove(Integer.valueOf(arr[i][0]));
        }
        for (int i:list){
            System.out.print(i+" ");
        }
    }
}
