package java_0620;

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        if (str.length()<=n){
            System.out.println(str);
        }
        String result = "";
        double x = 0.00;
        for(int i = 0; i < str.length()-n; i++){
            String temp = str.substring(i,i+n);
            if (GC(temp)>x){
                x=GC(temp);
                result = temp;
            }
        }
        if (x==0.00){
            System.out.println(str.substring(0,n));
            return;
        }
        System.out.println(result);
    }
    public static double GC(String str){
        int num = 0;
        char[] chars = str.toCharArray();
        for(char ch: chars){
            if (ch=='G'||ch=='C')
                num++;
        }
        return (double)num/str.length();
    }
}
