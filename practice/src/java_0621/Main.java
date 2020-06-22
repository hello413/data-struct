package java_0621;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,33,4,2,6};
        new Main().heapsort(arr);
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
        
    }
}
