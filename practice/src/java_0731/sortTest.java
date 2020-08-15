package java_0731;

import java.util.Queue;
import java.util.Stack;

import static Java_0406.Heap.shiftDown;

public class sortTest {
    private void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int num = arr[i];
            for (; j >= 0; j--) {
                if (arr[j] < num) {
                    break;
                }
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = num;
        }
    }

    private void hillSort(int[] arr) {
        for (int k = arr.length / 2; k >= 1; k /= 2) {
            for (int i = 0; i < arr.length; i++) {
                int j = i - k;
                int num = arr[i];
                for (; j >= 0; j -= k) {
                    if (arr[j] < num) {
                        break;
                    }
                    arr[j + k] = arr[j];
                }
                arr[j + k] = num;
            }
        }
    }

    public void chooseSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min = i;
            for (int j=i;j<arr.length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            exchange(arr,min,i);
        }
    }

    private void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void millSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            boolean flag = true;
            for (int j=arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    flag = false;
                    exchange(arr,j,j-1);
                }
            }
            if (flag){
                break;
            }
        }
    }

    private void heapSort(int[] arr){
        createHeap(arr,0,arr.length-1);
        for (int i = 0;i<arr.length;i++){
            exchange(arr,0,arr.length-1-i);
            shiftDown(arr,0,arr.length-i-1);
        }
    }

    private void createHeap(int[] arr, int index, int size) {
        for (int i = (size-1)/2;i>=0;i--){
            shiftDown(arr,i,arr.length);
        }
    }

    private void shiftDown(int[] arr, int index, int size) {
        int left = 2*index+1;
        while (left<size){
            int right = left+1;
            int max = left;
            if (right<size){
                max = arr[left]>arr[right]?left:right;
            }
            if (arr[max]>arr[index]){
                exchange(arr,index,max);
            }
            index=max;
            left = 2*index+1;
        }
    }
    private void quickedSort(int[] arr){
        quickedSorthelp(arr,0,arr.length-1);
    }

    private void quickedSorthelp(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int i =left,j=right;
        int temp = arr[right];
        while (i<j){
            while (i<j&&arr[i]<=temp){
                i++;
            }
            while (i<j&&arr[j]>temp){
                j--;
            }
            exchange(arr,i,j);
        }
        exchange(arr,i,right);
        quickedSorthelp(arr,left,i-1);
        quickedSorthelp(arr,i+1,right);
    }

    private void mergeSort(int[] arr){
        mergeSorthelp(arr,0,arr.length);
    }

    private void mergeSorthelp(int[] arr, int left, int right) {
        if (left+1>=right){
            return;
        }
        int mid = (left+right)/2;
        mergeSorthelp(arr,left,mid);
        mergeSorthelp(arr,mid,right);
        addArray(arr,left,mid,right);
    }

    private void addArray(int[] arr, int left, int mid, int right) {
        while (left>=right){
            return;
        }
        int length = right-left;
        int[] newArr = new int[length];
        int i=left,j=mid,k=0;
        while (i<mid&&j<right){
            newArr[k++]=(arr[i]<=arr[j])?arr[i++]:arr[j++];
        }
        while (i<mid){
            newArr[k++]=arr[i++];
        }
        while (j<right){
            newArr[k++]=arr[j++];
        }
        for (int t =0;t<length;t++){
            arr[left+t]=newArr[t];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2, 4, 0};
        new sortTest().mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
