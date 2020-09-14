package xiaomi;

public class Main1 {
    public static int firstMissingPositive (int[] nums) {
        // write code here

        int len = nums.length;
        int min = nums[0];
        int max = nums[0];
        int temp = nums[0];
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            if (num < min) min = num;
            if (num > max) max = num;
            temp ^= num;
        }
        if (max-min+1 == len) return min-1;
        for (int i = min; i <= max; i++) {
            temp ^= i;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,5,4};
        int res = missNum(arr);
        System.out.println(res);
    }

    public static int missNum(int[] arr){
        int l = 0;
        int r = arr.length;

        while (l<r){
            if (arr[l] == l+1){
                l++;
            }else if (arr[l]<=l || arr[l]>r||arr[arr[l]-1]==arr[l]){
                arr[l]=arr[--r];
            }else {
                swap(arr,l,arr[l]-1);
            }
        }
        return l+1;
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
