package java_0816;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int m = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int num =arr[m];
        int size = 1;
        for (int i:arr){
            if (i>num){
                size++;
            }
        }
        System.out.println(size);
    }
}
