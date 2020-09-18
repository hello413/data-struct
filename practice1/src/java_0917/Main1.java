package java_0917;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            in.nextLine();
            char[][] map = new char[n][m];
            int Sx = 0, Sy = 0;
            int Ex = 0, Ey = 0;
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLine().toCharArray();
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 'S') {
                        Sx = i;
                        Sy = j;
                    } else if (map[i][j] == 'E') {
                        Ex = i;
                        Ey = j;
                    }
                }
            }
            boolean[][] arr = new boolean[n][m];
            boolean flag = getPath(map,Sx,Sy,Ex,Ey,arr);
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean getPath(char[][] map,int Sx,int Sy,int Ex,int Ey,boolean[][] arr){
        if (Sx<0||Sx>=arr.length||Sy<0||Sy>=arr[0].length||map[Sx][Sy]=='#'||arr[Sx][Sy]){
            return false;
        }
        if (Sx==Ex&&Sy==Ey) return true;
        arr[Sx][Sy] = true;
        boolean flag = getPath(map, Sx+1, Sy, Ex, Ey, arr)||getPath(map, Sx-1, Sy, Ex, Ey, arr)||
                getPath(map, Sx, Sy+1, Ex, Ey, arr)||getPath(map, Sx, Sy-1, Ex, Ey, arr);
        arr[Sx][Sy] = false;
        return flag;
    }
}
