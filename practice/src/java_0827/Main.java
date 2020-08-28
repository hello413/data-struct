package java_0827;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x=0;
        if ((int)(3*Math.pow(Math.sin(x),3)+Math.pow(Math.cos(x),3))==3||(int)(3*Math.pow(Math.sin(x),3)+Math.pow(Math.cos(x),3))==2||(int)(3*Math.pow(Math.sin(x),3)+Math.pow(Math.cos(x),3))==4){
            System.out.println(Math.pow(Math.sin(x),2021)+Math.pow(Math.cos(x),2021));
        }
    }

    public static int dfs(int[] arr, int target, int temp) {
        if (target<temp)return 0;
        if (target==temp)return 1;
        int num = 0;
        for (int i=0;i<arr.length;i++){
            num+=dfs(arr, target, temp+arr[i]);
        }
        return num;
    }
}
