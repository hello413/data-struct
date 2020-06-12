package java_0611;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int N =input.nextInt();
            if (N<=2){
                System.out.println(1-N);
                continue;
            }
            int a = 1,b =1;
            while (b<N){
                int temp = a;
                a=b;
                b+=temp;
            }
            int result = (b-N)>(N-a)?N-a:b-N;
            System.out.println(result);
        }
    }
}
