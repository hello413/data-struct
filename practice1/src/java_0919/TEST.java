package java_0919;

import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,9};
        Arrays.sort(arr);
        System.out.println(75*943);
        if (arr[0]==0){
            System.out.println((arr[4]*100+arr[1]*10+arr[0])*(arr[3]*10+arr[2]));
        }else {
            System.out.println((arr[3]*100+arr[2]*10+arr[0])*(arr[4]*10+arr[1]));
        }
    }
}
