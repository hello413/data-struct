package java_0608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int W= input.nextInt();
            int H = input.nextInt();
            int max = W>H?W:H;
            int min = W<H?W:H;
            for (;max<=W*H;max++){
                if (max%W==0&&max%H==0){
                    System.out.println(max);
                    break;
                }
            }
        }
    }
}
