package java_0923;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        for (int i = 0; i < 50; i++) {
            int n = r.nextInt(300);
            if (n%2 == 0){
                count++;
            }
        }
    }
}
