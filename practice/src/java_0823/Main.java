package java_0823;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int t = in.nextInt();
        int m = in.nextInt();
        int[] times = new int[n];
        //任务到达时，需m个机器运行
        //机器运行时间为t
        //启动前需花费1
        //一次只能一个机器
        for (int i=0;i<n;i++){
            times[i] = in.nextInt();
        }
        if (t<m){
            System.out.println(-1);
            return;
        }
        if (times[times.length-1]<t){
            System.out.println(m);
            return;
        }
    }
}
