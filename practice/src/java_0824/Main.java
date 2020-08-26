package java_0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            if (arr[i][1]!=1){
                count+=arr[i][0];
            }else {
                list.add(arr[i][0]);
            }
        }
        Collections.sort(list);
        for (int i=list.size()-1;i>=0;i--){
            count+=(list.get(i)>count)?list.get(i):count;
        }
        System.out.println(count);
    }
}
