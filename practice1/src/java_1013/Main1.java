package java_1013;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Main1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum = 0;
        char c ='s';
        switch (c){
            default:
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("c");
                break;
        }
        while (cin.hasNextInt()) {
            String incomeOf = cin.next();
            if (incomeOf.equals("#")){
                break;
            }else if (!isNum(incomeOf)){
                System.out.println("error");
                return;
            }
            int incomeOfA = Integer.parseInt(incomeOf);
            int incomeOfB = cin.nextInt();

            //Start coding -- Input Data
        }
        System.out.println(440);
        //Start coding
    }

    private static boolean isNum(String str) {
        Pattern pattern = compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
}
