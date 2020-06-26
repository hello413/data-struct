package java_0621;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,33,4,2,6};
        new Main().merginsort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public void insertsort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            for (;j>=0;j--){
                if (arr[j]<=temp){
                    break;
                }
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }

    public void hillsort(int[] arr){
        for (int rap = arr.length/2;rap>0;rap/=2){
            for (int i = 0;i<arr.length;i++){
                int j=i-rap;
                int temp = arr[i];
                for (;j>=0;j-=rap){
                    if (arr[j]<=temp){
                        break;
                    }
                    arr[j+rap]=arr[j];
                }
                arr[j+rap]=temp;
            }
        }
    }

    public void selectsort(int[] arr){
        for (int i =0;i<arr.length;i++){
            int min = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            exchange(arr,i,min);
        }
    }

    private void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public void millsort(int[] arr){
        for (int i=0;i<arr.length;i++){
            boolean flag = true;
            for (int j=arr.length-1;j>=i+1;j--){
                if (arr[j]<arr[j-1]){
                    exchange(arr,j,j-1);
                    flag=false;
                }
            }
            if (flag){
                return;
            }
        }
    }

    public void heapsort(int[] arr){
        createheap(arr);
        for(int i=0;i<arr.length;i++){
            exchange(arr,0,arr.length-1-i);
            shiftdown(arr,arr.length-i-1,0);
        }
    }

    private void createheap(int[] arr) {
        for (int i = (arr.length-1-1)/2;i>=0;i--){
            shiftdown(arr,arr.length-1,i);
        }
    }

    private void shiftdown(int[] arr, int size, int index) {
        int left = 2*index+1;
        while (left<size){
            int right = left+1;
            int max = left;
            if (size>right){
                max = arr[left]<arr[right]?right:left;
            }
            if (arr[index]>=arr[max]){
                break;
            }
            exchange(arr,index,max);
            index = max;
            left = 2*index+1;
        }
    }

    public void quicksort(int[] arr){
        quickhelp(arr,0,arr.length-1);
    }

    private void quickhelp(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int begin = left,end = right;
        int temp = arr[right];
        while (begin<end){
            while (begin<end&&arr[begin]<=temp){
                begin++;
            }
            while (begin<end&&arr[end]>temp){
                end--;
            }
            exchange(arr,begin,end);
        }
        exchange(arr,begin,right);
        quickhelp(arr,left,begin-1);
        quickhelp(arr,begin+1,right);
    }

    private void quick(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while (!stack.isEmpty()){
            int right = stack.pop();
            int left = stack.pop();
            int marge = quickStack(arr,left,right);
            if (marge!=-1){
                stack.push(left);
                stack.push(marge-1);
                stack.push(marge+1);
                stack.push(right);
            }
        }
    }

    private int quickStack(int[] arr, int left, int right) {
        if (left>=right){
            return -1;
        }
        int begin = left,end = right;
        int temp = arr[right];
        while (begin<end){
            while (begin<end&&arr[begin]<=temp){
                begin++;
            }
            while (begin<end&&arr[end]>temp){
                end--;
            }
            exchange(arr,begin,end);
        }
        exchange(arr,begin,right);
        return begin;
    }

    private void merginsort(int[] arr) {
        merginsorthelp(arr,0,arr.length-1);
    }

    private void merginsorthelp(int[] arr, int left, int right) {
        if (left+1>=right){
            return;
        }
        int mid = (left+right)/2;
        merginsorthelp(arr,left,mid);
        merginsorthelp(arr,mid,right);
        arraysort(arr,left,mid,right);
    }

    private void arraysort(int[] arr, int left, int mid, int right) {
        if (left>right){
            return;
        }
        int[] arrcopy = new int[right-left];
        int i = left,j=mid;
        int k = 0;
        while (i<mid&&j<right){
            arrcopy[k++] = arr[i]>arr[j]?arr[j++]:arr[i++];
        }
        while (i<mid){
            arrcopy[k++] = arr[i++];
        }
        while (j<right){
            arrcopy[k++] = arr[j++];
        }
        int x = 0;
        for (int key:arrcopy){
            arr[left+x] = arrcopy[x];
            x++;
        }
    }

    private void merginssort(int[] arr){
        for (int i=1;i<arr.length;i*=2){
            for (int j = 0;j<arr.length;i+=2*i){
                int left = j;
                int mid =left+i;
                if (mid>=arr.length){
                    continue;
                }
                int right = mid+i;
                if (right>arr.length){
                    right = arr.length;
                }
                arraysort(arr,left,mid,right);
            }
        }
    }
}
