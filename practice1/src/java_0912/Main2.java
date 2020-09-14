package java_0912;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum1(arr);
        System.out.println(res);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> lists = new ArrayList<>();
        return lists;
    }

    //暴力
    private static List<List<Integer>> threeSum1(int[] arr) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int a=0;a<arr.length;a++){
            for (int b=a+1;b<arr.length;b++){
                for (int c=b+1;c<arr.length;c++){
                    if (arr[a]+arr[b]+arr[c]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[a]);
                        list.add(arr[b]);
                        list.add(arr[c]);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }
}
