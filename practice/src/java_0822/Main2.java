package java_0822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] prices = {1,2,3};
        ArrayList<ArrayList<Integer>> list = getList(prices,3);
        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> getList(int[] prices, int m) {
        ArrayList<ArrayList<Integer>> solutions = new ArrayList<>();
        if (prices==null||prices.length==0){
            return solutions;
        }
        List<Integer> solution = new ArrayList<>();
        if(prices.length == 0)
            return solutions;
        int curSum = 0;
        dfs(prices, solutions, solution, curSum, 0, m);
        return solutions;
    }

    private static void dfs(int[] prices, ArrayList<ArrayList<Integer>> solutions, List<Integer> solution, int curSum,
                            int prevPosition, int target) {
        if(curSum >= target) {
            if(curSum == target) {
                ArrayList<Integer> newS = new ArrayList<>();
                for(int e : solution)
                    newS.add(e);
                solutions.add(newS);
            }

            return;
        }
        for(int i = prevPosition; i < prices.length; ++i) {
            if(prices[i] > target)
                continue;
            solution.add(prices[i]);
            dfs(prices, solutions, solution, curSum + prices[i], i+1, target);
            solution.remove(solution.size() - 1);
        }
    }
}
