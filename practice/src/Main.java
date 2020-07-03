import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int N=input.nextInt();
            int pow = (int) Math.pow(N,2);
            int n=10;
            boolean flag =true;
            while (pow%n<pow){
                if (pow%n==N){
                    flag=false;
                    System.out.println("Yes!");
                    break;
                }
                n*=10;
            }
            if (flag) {
                System.out.println("No!");
            }
        }
    }
}