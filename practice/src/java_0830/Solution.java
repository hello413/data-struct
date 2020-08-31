package java_0830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    /**
     *1-2-3+4
     *1-(2-3)+4
     * @param expression
     * @return
     */
    public int getMaxResult (String expression) {
        // write code here
        String[] arr = expression.split("\\+");
        int count = 0;
        for (String i:arr){
            String[] split = i.split("-");
            for (int j=0;j<split.length;j++){
                if (j==0){
                    count+=Integer.parseInt(split[0]);
                }else if (j==1){
                    count -= Integer.parseInt(split[j]);
                }else{
                    count+=Integer.parseInt(split[j]);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        int result = new Solution().getMaxResult("1-2-3+4");
        System.out.println(result);
    }
}
