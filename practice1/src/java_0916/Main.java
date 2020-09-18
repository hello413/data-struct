package java_0916;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[112];
        for (int i = 0; i < 112; i++) {
            arr[i] = i;
        }

        int left = 0;
        int right = 111;
        int target = 1111;
        int count = 0;
        while (left <= right){
            int mid = left+(right-left)/2;
            count++;
            if (arr[mid]<target){
                left=mid+1;
            }else if (arr[mid] > target){
                right = mid-1;
            }else {
                break;
            }
        }

        System.out.println(count);
    }
}
