package java_0726;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
//            Integer i = it.next();
//            System.out.println(i);
//        }
        String permutation = new Test().getPermutation(3, 3);
        System.out.println(permutation);
    }
    public String getPermutation(int n, int k) {
        // 阶乘数
        int[] factorialNum = new int[n];
        // 把k转换为从0开始的下标
        k = k - 1;
        // 阶乘数的最低位必然为0
        factorialNum[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            factorialNum[n - i - 1] = k % (i + 1);
            k /= i + 1;
        }
        // 从1到n的全部数字
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }

        // 把阶乘数转换为具体的排列
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // 阶乘数的权重即为应当选取的数字的下标
            sb.append(nums.get(factorialNum[i]));
            // 移除已经用过的数字
            nums.remove(factorialNum[i]);
        }

        return sb.toString();
    }
}
