package java_0918;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static String removeOneConnection(int[][] edges){
        if (edges.length%2!=0)
            return "Y";
        return "N";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        in.nextLine();
        String[] line = in.nextLine().split(",");
        int[] arr = new int[line.length];
        for (int i=0;i<arr.length;i++)
            arr[i] = Integer.valueOf(line[i]);
        int num = buy(money,arr);
        System.out.println(num);
    }

    public static int buy(int money, int[] items){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (items.length==0)return 0;
        int curSum = 0;
        dfs(items,lists,list,curSum,0,money);
        return lists.size();
    }

    private static void dfs(int[] items, ArrayList<ArrayList<Integer>> sets, ArrayList<Integer> set, int cur, int prev, int money) {
        if (cur >= money) {
            if (cur == money) {
                sets.add(set);
            }
            return;
        }
        for (int i = prev; i < items.length; i++) {
            if (items[i]>money)
                continue;
            set.add(items[i]);
            dfs(items, sets, set, cur+items[i], i, money);
            set.remove(set.size()-1);
        }
    }
}
