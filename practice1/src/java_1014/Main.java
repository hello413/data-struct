package java_1014;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = maxString(str);
        System.out.println(result);
    }

    private static String maxString(String s) {
        if (s==null)return null;
        int len =s.length();
        int[] arr = new int[len];
        for (int i=0;i<len;i++)
            arr[i]=(int)s.charAt(i)-(int)'a';
        int a = 26;
        long modulus = (long) Math.pow(2,32);
        int left = 1,right = len;
        int mid = 0;
        while (left!=right){
            mid=left+(right-left)/2;
            if (search(mid,a,modulus,len,arr)!=-1)
                left=mid+1;
            else
                right = mid;
        }
        int start = search(left-1,a,modulus,len,arr);
        return start!=-1?s.substring(start,start+left-1):"";
    }

    private static int search(int mid, int a, long modulus, int len, int[] arr) {
        long h = 0;
        for (int i=0;i<mid;i++)
            h=(h*a+arr[i])%modulus;
        HashSet<Long> set = new HashSet<>();
        set.add(h);
        long aL =1;
        for (int i=1;i<=mid;i++)
            aL=(aL*a)%modulus;
        for (int i = 1;i<len-mid+1;i++){
            h=(h*a-arr[i-1]*aL%modulus+modulus)%modulus;
            h=(h+arr[i+mid-1])%modulus;
            if (set.contains(h))return i;
            set.add(h);
        }
        return -1;
    }
}
