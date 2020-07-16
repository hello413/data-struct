package java_0717;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] array = new int[n*n];
        int size=0;
        for(int i = n-1;i>=0;i--){
            int h = 0;
            for(int j=i;j<n;j++){
                array[size++] = arr[h++][j];
            }
        }
        for(int i = 1;i<n;i++){
            int h = 0;
            for(int j=i;j<n;j++){
                array[size++] = arr[j][h++];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int[] ints = new Printer().arrayPrint(arr, 4);
        for (int i:ints){
            System.out.print(i+" ");
        }
    }
}
