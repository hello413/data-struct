package java_0905;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0){
            int count = 0;
            int N = in.nextInt();
            int[][] arr = new int[N][2];
            for (int i=0;i<N;i++){
                arr[i][0] = in.nextInt();
                arr[i][1] = in.nextInt();
            }
            for (int i=0;i<N;i++){
                if (arr[i][1]==1){
                    for (int j=0;j<N&&i!=j;j++){
                        if (arr[i][1]==1&&arr[j][1]==1) {
                            if ((arr[i][0] == 0 && arr[j][0] == 1) || (arr[i][0] == 1 && arr[j][0] == 0)) {
                                arr[i][1] = -1;
                                arr[j][1] = -1;
                            }
                            if ((arr[i][0] == 2 && arr[j][0] == 3) || (arr[i][0] == 3 && arr[j][0] == 2)) {
                                arr[i][1] = -1;
                                arr[j][1] = -1;
                            }
                        }
                    }
                }
            }
            for (int i=0;i<N;i++){
                if (arr[i][1]==1)count++;
            }
            System.out.println(count);
        }
    }
}
