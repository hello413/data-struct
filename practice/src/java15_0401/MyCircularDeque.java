package java15_0401;

class MyCircularDeque {
    private int[]  arr;
    private int head =0;
    private int tail =0;
    private int size = 0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        arr = new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (arr.length == size){
            return false;
        }
        size++;
        head--;
        if (head<0){
            head=arr.length-1;
        }
        arr[head] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (arr.length == size){
            return false;
        }
        arr[tail] = value;
        size++;
        tail++;
        if (tail >= arr.length){
            tail=0;
        }
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0){
            return false;
        }
        head++;
        size--;
        if (head >= arr.length){
            head=0;
        }
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0){
            return false;
        }
        size--;
        tail--;
        if (tail<0){
            tail=arr.length-1;
        }
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (size == 0){
            return -1;
        }
        return arr[head];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (size == 0){
            return -1;
        }
        return tail==0?arr[arr.length-1]:arr[tail-1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
