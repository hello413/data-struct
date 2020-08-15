import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String str = sc.next();
        if (str==null){
            System.out.println(0);
        }
        String[] arr = line.split(" ");
        int num=0;
        for (int i =0;i<arr.length;i++){
            String s = arr[i];
            for (int j=0;j<s.length()&&j<str.length();j++){
                if (str.contains(s.charAt(j)+"")){
                    num++;
                }else {
                    break;
                }
            }
        }
        System.out.println(num);
    }
}