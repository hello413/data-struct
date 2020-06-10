package java_0609;

import java.util.Scanner;

public class heapSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String str = input.nextLine();
            String[] s = str.split(" ");
            int[] arr = new int[s.length-1];
            int k = Integer.parseInt(s[s.length-1]);
            for (int i =0;i<s.length-1;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            heapsort(arr,k);
            for (int i=0;i<k;i++){
                System.out.print(arr[arr.length-1-i]+" ");
            }
        }
    }

    private static void heapsort(int[] arr, int k) {
        createheap(arr);
        for (int i=0;i<k;i++){
            exchange(arr,0,arr.length-1-i);
            shiftdown(arr,arr.length-1-i,0);
        }
    }

    private static void createheap(int[] arr) {
        for (int i=(arr.length-1-1)/2;i>=0;i--){
            shiftdown(arr,arr.length-1,i);
        }
    }

    private static void shiftdown(int[] arr, int size, int index) {
        int left = 2*index+1;
        int min = left;
        while (left<=size){
            int right=2*index+2;
            if (size>=right){
                min = arr[left]>arr[right]?right:left;
            }
            if (arr[index]<arr[min]){
                break;
            }
            exchange(arr,index,min);
            index=min;
            left=2*index+1;
        }
    }

    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
