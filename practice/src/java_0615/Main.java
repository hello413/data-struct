package java_0615;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int[] arr = new int[10];
            for (int i = 0;i<10;i++){
                arr[i] = input.nextInt();
            }
            for(int i = 1;i<10;i++){
                if (arr[i]!=0){
                    System.out.print(i);
                    arr[i]--;
                    break;
                }
            }
            for (int i=0;i<10;i++){
                while (arr[i]--!=0){
                    System.out.print(i);
                }
            }
        }
    }

    public static void main1(){
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int m = input.nextInt();
            int num = (int) Math.pow(m,3);
            String str = "";
            for (int i =0;i<m;i++){
                str+=(num/m-m+1+i*2+"+");
            }
            System.out.println(str.substring(0,str.length()-1));
        }
    }
}
