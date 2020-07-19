package java_0719;

public class TwoDefferent {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 2, 3, 3, 5};
        int result = 0;
        for (int i:arr){
            result^=i;
        }
        int flag = 1;
        for (int i = 0; i < 32; i++) {
            if ((result & (flag<<=i))!=0) {
                break;
            }
        }
        int a=0,b=0;
        for (int i:arr){
            if ((flag&i)!=0){
                a^=i;
            }else {
                b^=i;
            }
        }
        System.out.println(a+" "+b);
    }
}
