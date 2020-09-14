package java_0914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] arr = new char[7][4];
        for (int i=0;i<7;i++){
            arr[i]="ABCD".toCharArray();
        }
        int size = 0;
        while (size!=28&&in.hasNext()){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            if (x<0||x>6||y<0||y>3){
                System.out.println("无效座位");
                continue;
            }
            if (arr[x][y]=='X'){
                System.out.println("已经被占用");
            }else {
                arr[x][y]='X';
                size++;
            }
        }
        if (size==28){
            System.out.println("座位已满");
        }else {
            System.out.println("退出");
        }
    }
}
