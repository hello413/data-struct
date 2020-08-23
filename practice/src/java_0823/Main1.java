package java_0823;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arrs = new int[n];
        for (int i=0;i<n;i++){
            arrs[i] = in.nextInt();
        }
        ArrayList<ArrayList<Integer>> list = getSubArray(arrs,n);
        int count = 0;
        for (int i=0;i<list.size();i++){
            boolean flag =true;
            for (int j=0;j<list.get(i).size();j++){
                for (int x = j+1;x<list.get(i).size();x++){
                    if ((list.get(i).get(j)+list.get(i).get(x))%k==0){
                        flag=!flag;
                        break;
                    }
                }
                if (!flag){
                    break;
                }
            }
            if (flag){
                count++;
            }
            count%=1000000007;
        }
        System.out.println(count);
    }

    private static ArrayList<ArrayList<Integer>> getSubArray(int[] arrs, int n) {
        ArrayList<ArrayList<Integer>> blist = new ArrayList<ArrayList<Integer>>();
        int mark = 0;
        int nEnd = 1<<n;
        boolean bNullset = false;
        for (mark = 0;mark<nEnd;mark++){
            ArrayList<Integer> list = new ArrayList<>();
            bNullset= true;
            for (int i=0;i<n;i++){
                if (((1<<i)&mark)!=0){
                    bNullset = false;
                    list.add(arrs[i]);
                }
            }
            blist.add(list);
        }
        return blist;
    }

}
