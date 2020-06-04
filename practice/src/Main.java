import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //while (input.hasNext()){
        int count = 0;
        String str1 = input.next();
        String str2 = input.next();
        for (int i = 0;i<str1.length();i++){
            StringBuffer str = new StringBuffer(str1);
            if (ishui(str.insert(i,str2).toString())){
                count++;
            }
        }
        System.out.println(count);
        // }
    }
    public static boolean ishui(String s){
        for (int i = 0;i<=s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
