package Java_0407;

public class MyPriorityQueue {
    private int[] arr = new int[100];
    private int size = 0;

    public void offer(int val){
        arr[size++] = val;
        shiftUp(arr,size-1);
    }

    private void shiftUp(int[] arr, int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] >= arr[index]) {
                break;
            }
            int t = arr[parent];
            arr[parent] = arr[index];
            arr[index] = t;
            index = parent;
        }
    }

    public int poll(){
        int oldVal = arr[0];
        arr[0] =arr [--size];
        shiftDown(arr,size,0);
        return oldVal;
    }

    private void shiftDown(int[] arr, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int min = left;
            int right = 2 * index + 2;
            if (right < size) {
                if (arr[right] < arr[left]) {
                    min = right;
                }
            }
            if (arr[index] <= arr[min]) {
                break;
            }
            int t = arr[index];
            arr[index] = arr[min];
            arr[min] = t;
            index = min;
            left = 2 * index + 1;
        }
    }

    public int peek(){
        return arr[0];
    }
}
