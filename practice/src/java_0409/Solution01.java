package java_0409;

public class Solution01 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0,right = nums.length-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (nums[left]!=target){
            return new int[]{-1,-1};
        }
        int leftnum=right;
        left=0;
        right=nums.length-1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                left = mid;
                if (nums[left+1]==target){
                    left = mid + 1;
                }else {
                    break;
                }
            }else if(nums[mid]<target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return new int[]{leftnum,left};
    }

    public static void main(String[] args) {
        for (int i:new Solution01().searchRange(new int[]{1},1)){
            System.out.println(i);
        }
        System.out.println();
    }
}
