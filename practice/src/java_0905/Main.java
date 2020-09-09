package java_0905;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] goods = new int[N];
        for (int i=0;i<N;i++){
            goods[i] = in.nextInt();
            stack.add(goods[i]);
        }
        int index = 0;
        while (M-->0){
            int left = 0,right = 0;
            int K = in.nextInt();
            while(K-->0){
                String line = in.nextLine();
                String[] arr = line.split(" ");
                if (arr[1].equals("take")){

                }
            }
        }
    }
}
