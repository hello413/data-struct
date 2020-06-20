package java_0616;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        quicksort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void quicksort(int[] arr) {
        quickhelp(arr,0,arr.length-1);
    }

    private static void quickhelp(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int begin = left;
        int end = right;
        int temp = arr[right];
        while (begin<end){
            while (begin<end){
                while (begin<end&&arr[begin]<=temp){
                    begin++;
                }
                while (begin<end&&arr[end]>=temp){
                    end--;
                }
                exchange(arr,begin,end);
            }
        }
        exchange(arr,end,right);
        quickhelp(arr,left,end-1);
        quickhelp(arr,end+1,right);
    }

    private static void exchange(int[] arr, int begin, int end) {
        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;
    }

}
