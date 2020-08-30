import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m =in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int count = 0;
        int k=0;
        int[] temp =new int[k];
        int s =0;
        for (int i=1;i<=m;i++){
            for (int j=i;j<=m;j++){
                int x =arr[k];
                while (k<n-1&&0<x&&x<i||j<x&&x<m+1){
                    temp[s++] = arr[k++];
                }
                if (isSort(temp)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isSort(int[] temp) {
        for (int i=0;i<temp.length;i++){
            if (temp[i]>temp[i+1]){
                return false;
            }
        }
        return true;
    }

    private static int PrinMax(int n) {
    if(n<2)return n;
    return PrinMax(n-1)+PrinMax(n-2);
    }
}