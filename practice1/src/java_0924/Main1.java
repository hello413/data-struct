package java_0924;

import java.util.Scanner;

public class Main1 {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int H = in.nextInt();
            int L = in.nextInt();
            if (L>=3*H){
                System.out.println("no");
                continue;
            }

            Integer.parseInt("2");
            int size = 0;
            int sum = H;
            while (sum <= L) {
                size++;
                sum += H;
                H /= 2;
            }
            System.out.println(size);
        }
    }
}
