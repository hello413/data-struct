package java_0610;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n=input.nextInt();
            String s = n+"";
            for(int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }
        }
    }

    private static int qiecheng(int n) {
        int result = 1;
        for (int i = 1;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
