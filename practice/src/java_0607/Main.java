package java_0607;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String s = input.nextLine();
            String [] str=s.split(" ");
            Integer [] arr= new Integer[str.length];
            for(int i=0;i<str.length;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            System.out.println(bigThanHalf(arr,arr.length));
        }
    }

    private static int bigThanHalf(Integer[] arr, int length) {
        for (int i:arr){
            int count=0;
            for (int j:arr){
                if (i==j){
                    count++;
                }
            }
            if (count>=arr.length/2){
                return i;
            }
        }
        return 0;
    }
}
