package Java_0414;

import java.util.Arrays;

public class sortTest {
    public void insertsort(int[] arr){
        if (arr.length==0||arr.length==1){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            int j = i-1;
            int num = arr[i];
            for (;j>=0;j--){
                if (arr[j] < num){
                    break;
                }
                arr[j+1] = arr[j];
            }
            arr[j+1] = num;
        }
    }

    public void hillsort(int[] arr){
        if (arr.length==0||arr.length==1){
            return;
        }
        for (int k = arr.length/2;k>0;k/=2){
            for (int i = 1;i < arr.length;i++){
                int j = i - k;
                int num = arr[i];
                for (;j>=0 && arr[j] > num;j-=k){
                    arr[j+k] = arr[j];
                }
                arr[j+k] = num;
            }
        }
    }

    public void selectsort(int[] arr){
        if (arr.length==0||arr.length==1){
            return;
        }
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
    public void exange(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        sortTest test = new sortTest();
        int[] arr = {1,5,6,2,6,4,1,7};
        test.selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
