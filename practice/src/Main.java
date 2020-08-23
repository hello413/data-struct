import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    private static int PrinMax(int index, int[] arr) {
        int first = 0,second = 0;
        arr[index] = 0;
        for (int i=0;i<arr.length;i++){
            if (i<index){
                first+=arr[i];
            }else if(i>index){
                second+=arr[i];
            }
        }
        return Math.max(first,second);
    }
}