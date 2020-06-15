package java_0614;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        int N = (int) Math.pow(2,n);
        String[] str = new String[N];
        for (int i = 0;i<N;i++){
            str[i] = Integer.toBinaryString(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String[] str = new GrayCode().getGray(2);
        for (String i:str){
            System.out.print(i+" ");
        }
    }
}
