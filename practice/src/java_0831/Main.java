package java_0831;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] nums = {50, 9, 0 ,23, 2, 21};
        System.out.println(method(nums));
    }
    public static String method(int nums[]){
        String temp = "";;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                continue;
            }
            list.add(nums[i]);
        }
        //集合中进行排序，自定义比较器，数字以自定义的大小排列（转换成字符串，正反拼接比较），较大的放后面
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if((o1.toString()+o2.toString()).compareTo(o2.toString()+o1.toString()) > 0)
                    return -1;
                else
                    return 1;
            }
        });
        boolean flag = false;
        for (int i:nums){
            if (i==0)flag=true;
        }
        int first = 0;
        //因为大的在后面，所以反向相加
        while(!list.isEmpty()){
            first++;
            temp +=list.remove(list.size()-1);
            if (flag&&first == 1) temp+="0";
        }
        return temp;
    }
}
