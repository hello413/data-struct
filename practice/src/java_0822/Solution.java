package java_0822;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int[] temp = new int[in.nextInt()];
        for (int i=0;i<temp.length;i++){
            temp[i]=in.nextInt();
            if (i-1>=0&&temp[i]==2&&temp[i-1]==2){
                temp[i]=0;temp[i-1]=0;
            }
        }
        for (int i:temp){
            exchange(i,arr);
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void exchange(int size, int[] arr) {
        if (size==1){
            int temp = arr[0];
            for (int i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1]= temp;
        }else if (size==2){
            int i=0;
           while (i<arr.length){
                if (i+1<arr.length){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                i+=2;
            }
        }
    }
}
