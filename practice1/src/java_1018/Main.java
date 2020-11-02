package java_1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n] ;
        for (int i=0;i<n;i++)arr[i] = in.nextInt();
        int[] result = getIndexArr(arr);
        for (int i:result){
            System.out.print(i+" ");
        }
    }

    private static int[] getIndexArr(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        if (arr.length<=3){
            while (i<arr.length){
                result[i]=++i;
            }
            return result;
        }
        int[] temp = new int[3];
        for (i=0;i<3;i++){
            result[i] = i+1;
            temp[i]=arr[i];
        }
        for (i=3;i<result.length;i++){
            int index = (temp[0]<temp[1])?(temp[0]<temp[2]?0:2):(temp[1]<temp[2]?1:2);
            doArr(temp,index);
            temp[index] = arr[i];
            result[i] = index+1;
        }
        return result;
    }

    private static void doArr(int[] temp, int index) {
        int t = temp[index];
        temp[0] -= t;
        temp[1] -= t;
        temp[2] -= t;
    }
}
