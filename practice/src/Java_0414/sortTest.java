package Java_0414;

import java.util.Arrays;
import java.util.Stack;

public class sortTest {
    private void insertsort(int[] arr){
        if (arr.length==0||arr.length==1){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            int j = i-1;
            int num = arr[i];
            for (;j>=0;j--){
                if (arr[j] <= num){
                    break;
                }
                arr[j+1] = arr[j];
            }
            arr[j+1] = num;
        }
    }

    public void hillsort(int[] arr){
        for (int gap = arr.length/2;gap>0;gap/=2){
            for (int i = 1;i < arr.length;i++){
                int j = i - gap;
                int num = arr[i];
                for (;j>=0 && arr[j] > num;j-=gap){
                    arr[j+gap] = arr[j];
                }
                arr[j+gap] = num;
            }
        }
    }

    private void selectsort(int[] arr){
        for (int i = 0;i < arr.length; i++){
            int min = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            exange(arr,i,min);
        }
    }

    private void heapsort(int[] arr){
        createheap(arr);
        for (int i=0;i<arr.length;i++){
            exange(arr,0,arr.length-i-1);
            shiftdown(arr,arr.length-i-1,0);
        }
    }

    private void createheap(int[] arr) {
        for (int i=(arr.length-1)/2;i>=0;i--){
            shiftdown(arr,arr.length,i);
        }
    }

    private void shiftdown(int[] arr, int size, int index) {
        int left = 2 * index+1;
        while (left<size){
            int max = left;
            int right = 2*index+2;
            if (size>right){
                if (arr[right] > arr[left]){
                    max = right;
                }
            }
            if (arr[index]>=arr[max]){
                break;
            }
            exange(arr,index,max);
            index=max;
            left=2*index+1;
        }
    }

    private void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean issorted = true;
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    exange(arr,j,j+1);
                    issorted = false;
                }
            }
            if (issorted){
                return;
            }
        }
    }

    private void quicksort(int[] arr){
        quickedhead(arr,0,arr.length-1);
    }

    private void quickedhead(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int i = left;
        int j = right;
        int par = arr[right];
        while (i<j){
            while (i<j&&arr[i]<=par){
                i++;
            }
            while (i<j&&arr[j]>=par){
                j--;
            }
            exange(arr,i,j);
        }
        exange(arr,i,right);
        quickedhead(arr,left,i-1);
        quickedhead(arr,i+1,right);
    }

    private void quickheap(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length-1);
        stack.push(0);
        while (!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if (left>=right){
                continue;
            }
            int mid = parheap(arr,left,right);
            stack.push(mid-1);
            stack.push(left);
            stack.push(right);
            stack.push(mid+1);
        }
    }

    private int parheap(int[] arr, int left, int right) {
        if (left>=right){
            return -1;
        }
        int i = left;
        int j = right;
        int par = arr[right];
        while (i<j){
            while (i<j&&arr[i]<=par){
                i++;
            }
            while (i<j&&arr[j]>=par){
                j--;
            }
            exange(arr,i,j);
        }
        exange(arr,i,right);
        return i;
    }

    private void addarray(int[] arr, int left, int mid, int right){
        if (left>=right){
            return;
        }
        int i = left, j=mid, k=0;
        int length = right-left;
        int[] extra = new  int[length];
        while (i < mid && j < right){
            extra[k++] = (arr[i]<=arr[j])?arr[i++]:arr[j++];
        }
        while (i<mid){
            extra[k++] = arr[i++];
        }
        while (j<right){
            extra[k++] = arr[j++];
        }
        for (int t=0;t<extra.length;t++){
            arr[t+left] = extra[t];
        }
    }

    private void mergesort(int[] arr){
        mergesortheap(arr,0,arr.length);
    }

    private void mergesortheap(int[] arr, int left, int right) {
        if (right-left<=1){
            return;
        }
        int mid = (left+right)/2;
        mergesortheap(arr,left,mid);
        mergesortheap(arr,mid,right);
        addarray(arr,left,mid,right);
    }

    private void mergeedsort(int[] arr){
        for (int i = 1;i<arr.length;i*=2){
            for (int j = 0;j<arr.length;j=j+2*i){
                int left = j;
                int mid =left+i;
                if (mid>=arr.length){
                    continue;
                }
                int right = mid+i;
                if (right>arr.length){
                    right = arr.length;
                }
                addarray(arr,left,mid,right);
            }
        }
    }

    private void exange(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        sortTest test = new sortTest();
        int[] arr = {1,5,6,2,6,4,1,7};
        test.heap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
