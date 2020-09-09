package java_0905;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] z = new int[n];
        int[] f = new int[n];
        int j=0,k=0;
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
            if (arr[i]>0){
                arr[j++] = arr[i];
            }else {
                f[k++] = arr[i];
            }
        }
        zhenSort(z);
        Arrays.sort(f);
        j=0;k=0;
        for (int i=1;i<=n;i++){
            if (i%2==1){
                System.out.print(f[j++]+" ");
            }else {
                System.out.print(z[k++]+" ");
            }
        }
    }

    private static void zhenSort(int[] z) {
        for (int i =0;i<z.length;i++){
            for (int j = z.length-1;j>=i;j--){
                swap(z,j,j+1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
