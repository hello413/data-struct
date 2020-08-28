import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(PrinMax(7));
    }

    private static int PrinMax(int n) {
    if(n<2)return n;
    return PrinMax(n-1)+PrinMax(n-2);
    }
}