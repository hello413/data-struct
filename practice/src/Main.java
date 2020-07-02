import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 7, 5};
        mergesort2(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergesort(int[] arr) {
        mergesorthelp(arr, 0, arr.length);
    }

    private static void mergesorthelp(int[] arr, int left, int right) {
        if (left + 1 >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesorthelp(arr, left, mid);
        mergesorthelp(arr, mid, right);
        addarray(arr, left, mid, right);
    }

    private static void addarray(int[] arr, int left, int mid, int right) {
        if (left >= right) {
            return;
        }
        int length = right - left;
        int[] temp = new int[length];
        int i = left, j = mid, k = 0;
        while (i < mid && j < right) {
            temp[k++] = arr[i] > arr[j] ? arr[j++] : arr[i++];
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < right) {
            temp[k++] = arr[j++];
        }
        for (int ch = 0; ch < length; ch++) {
            arr[ch + left] = temp[ch];
        }
    }

    private static void mergesort2(int[] arr) {
        for (int i = 1; i < arr.length; i *= 2) {
            for (int j = 0; j < arr.length; j = j + 2 * i) {
                int left = j;
                int mid = left + i;
                if (mid >= arr.length) {
                    continue;
                }
                int right = mid + i;
                if (right > arr.length) {
                    right = arr.length;
                }
                addarray(arr, left, mid, right);
            }
        }
    }
}