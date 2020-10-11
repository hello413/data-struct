package java_1010;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    static Map<String,String> map = new HashMap<>();
    static int size = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ch = in.next();
        int n = in.nextInt();
        in.nextLine();
        while (n-->0){
            String[] arr = in.nextLine().split("->");
            map.put(arr[0],arr[1]);
        }
        getSize(ch,ch);
        System.out.println(size);
    }

    private static void getSize(String first, String key) {
        if (!map.get(key).equals(first)) {
            size++;
        }else {
            return;
        }
        getSize(first,map.get(key));
    }
}
