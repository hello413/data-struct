package java_1023;

public class Quiesort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,2,6,7,9,1};
        quicksort(arr);
        for (int i:arr)
            System.out.print(i+" ");
    }

    private static void quicksort(int[] arr) {
        if (arr==null||arr.length<=1)return;
        int left = 0;
        int right = arr.length;
        tempArr(arr,left,right-1);

    }

    private static void tempArr(int[] arr, int left, int right) {
        if (left>=right)return;
        int temp = arr[left];
        int i = left,j=right;
        while (i<j){
            while(i<j&&arr[j]>temp){
                j--;
            }
            arr[i] = arr[j];
            while (i<j&&arr[i]<=temp){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = temp;
        tempArr(arr,left,i-1);
        tempArr(arr,i+1,right);
    }
}
