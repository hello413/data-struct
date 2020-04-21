package java_0420;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution02 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i:nums1){
            set.add(i);
        }
        int[] arr = new int[nums1.length>nums2.length?nums1.length:nums2.length];
        int k = 0;
        for (int i:nums2){
            if (set.contains(i)){
                arr[k++] = i;
                set.remove(i);
            }
        }
        return Arrays.copyOfRange(arr,0,k);
    }
}
