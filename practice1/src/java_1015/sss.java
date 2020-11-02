package java_1015;

import java.util.ArrayList;
import java.util.Collections;

public class sss {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(6);
        listA.add(7);
        listA.add(2);
        listA.add(1);
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(6);
        listB.add(4);
        listB.add(1);
        listB.add(2);
        ArrayList<Integer> LIST = list(listA, listB);
        for (Integer i : LIST) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> list(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        listB.removeAll(listA);
        listA.addAll(listB);
        Collections.sort(listA);
        return listA;
    }

    public static void quickSort(int[] array) {
        quickSortHelp(array, 0, array.length - 1);
    }
    static int m=0;
    public static void quickSortHelp(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = a[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && a[j] > temp) {
                j--;
            }
            a[i] = a[j];
            while (i < j && a[i] <= temp) {
                i++;
            }
            a[j] = a[i];
        }
        a[i] = temp;
        quickSortHelp(a, left, i - 1);
        quickSortHelp(a, j + 1, right);

    }
}
