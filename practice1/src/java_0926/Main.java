package java_0926;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            int v = in.nextInt();
            int count = 0;
            while (a > 0 && b >= (k - 1)) {
                a -= (k * v);
                b -= (k - 1);
                count++;
            }
            if (b!=0){
                a-=((b+1)*v);
                count++;
            }
            count += ((int) (a / (1.0 * v) + 0.5));
            System.out.println(count);
        }
    }
}
