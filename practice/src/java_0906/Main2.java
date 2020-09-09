package java_0906;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0;i<n1;i++){
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0;i<n2;i++){
            arr2[i] = in.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int index1 = 0,index2 = 0;
        while (index1<n1&&index2<n2){
            if (arr1[index1]==arr2[index2]){
                while (index1<n1&&index2<n2&&arr1[index1]==arr2[index2]){
                    list.add(arr1[index1]);
                    index1++;index2++;
                }
            }else if(arr1[index1]<arr2[index2]){
                index2++;
            }else {
                index1++;
            }
        }
        for (int i:list){
            System.out.println(i+" ");
        }
    }
}
