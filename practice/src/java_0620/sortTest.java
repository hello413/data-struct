package java_0620;

public class sortTest {


    public static void main(String[] args) {
        int[] arr = {1,5,9,3,4,2,4};
        new sortTest().mergesort(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    private static void insertsort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int j = i-1;
            int num = arr[i];
            for (;j>=0;j--){
                if (arr[j] <= num){  //如果比i位置的值大或等于就退出
                    break;
                }
                arr[j+1] = arr[j];  //都是比i位置小的情况
            }
            arr[j+1] = num;
        }
    }

    public void hillsort(int[] arr){        //希尔
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
}
