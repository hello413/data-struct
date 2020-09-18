package java_0916;

public class Solution {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        swap(a,b);
        System.out.println(a+" "+b);
    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a=b;
        b=temp;
    }
}
