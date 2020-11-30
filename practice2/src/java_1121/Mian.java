package java_1121;

public class Mian {
    public void SortMerge(int[] arr,int left,int right){
        if(right-left<=1)return;
        int mid = (left+right)/2;
        SortMerge(arr,left,mid-1);
        SortMerge(arr,mid+1,right);
    }
}
