package java_0809;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int num1 = getLength(arr);
        int num =num1;
        if (arr.length>1){
            int[] arr1 = new int[N-1];
            for(int i=0;i<arr1.length;i++){
                arr1[i] = arr[i+1];
            }
            int num2 = getLength(arr1);
            num = Math.max(num1,num2);
        }
        System.out.println(num);
    }

    private static int getLength(int[] arr) {
        int i,max=0,temp_sum=0;
        for(i=0;i<arr.length;i++) {
            int flag = 1;
            if (i%2==0){
                flag = 1;
            }else {
                flag=-1;
            }
            temp_sum+=flag*arr[i];
            if(temp_sum>max) {
                max = temp_sum;
            }else if(temp_sum<0) {
                temp_sum = 0;
            }
        }
        return max;
    }
}
