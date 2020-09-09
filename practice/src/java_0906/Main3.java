package java_0906;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int man = in.nextInt();
        int team = in.nextInt();

        List<List<Integer>> lists = new ArrayList<>();
        for (int i=0;i<team;i++){
            int num = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0;j<num;j++){
                list.add(in.nextInt());
            }
            lists.add(list);
        }
        boolean[] arr = new boolean[team];
        Set<Integer> set = new HashSet<>();
        getNum(lists,0,arr,set);
        System.out.println(set.size());
    }

    private static void getNum(List<List<Integer>> lists, int index, boolean[] arr, Set<Integer> set) {
        for (int i=0;i<lists.size();i++){
            if (lists.get(i).contains(index)&&!arr[i]){
                arr[i] = true;
                for (int j=0;j<lists.size();j++){
                    int num = lists.get(i).get(j);
                    set.add(num);
                    getNum(lists,num,arr,set);
                }
            }
        }
    }
}
