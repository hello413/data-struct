package java_0811;

import java.util.Scanner;

public class Main {
    public static boolean IsPalindrome(StringBuffer sb, int[] start, int[] end) {
        int i = 0;
        int j = sb.length() - 1;
        boolean result = true;
        while (i <= j) {
            if (sb.charAt(i) != sb.charAt(j)) { //不是回文
                result = false;
                break;
            }
            i++;
            j--;
        }
        if (start != null) start[0] = i;
        if (end != null) end[0] = j;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            StringBuffer sb = new StringBuffer(sc.next()); //char[] arr = s.toCharArray();
            int[] start = new int[1];
            int[] end = new int[1];
            int size = 0;
            if (IsPalindrome(sb, start, end)) { //判定是否已经是回文了
                // 说明本来就是回文
                System.out.println(0);
            } else {
                sb.deleteCharAt(end[0]);
                if (IsPalindrome(sb, null, null)) {
                    System.out.println(end[0]);
                } else {
                    System.out.println(start[0]);
                }
            }
            num--;
        }
    }
}