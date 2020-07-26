package java_0721;

// write your code here
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int n = 5;
        int num = jump(n);
    }

    private static int jump(int n) {
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        return 2*jump(n-1);
    }
}
