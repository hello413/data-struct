package java_0617;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int x = input.nextInt();
            if(x % 1000000007 == 0){
                System.out.println(0);
            }else {
                int count = 0;
                while (x != 0 && count <= 300000) {
                    x = ((x << 1) + 1) % 1000000007;
                    count++;
                }
                int res = (count + 2) / 3;
                System.out.println(res > 100000 ? -1 : res);
            }
        }
    }
}
