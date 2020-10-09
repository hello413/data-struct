package java_1008;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Solution {
    public int reorder (int[] prices) {
        // write code here
        if(prices==null||prices.length<=2)return 0;
        return (prices.length-1)/2;
    }

    public static int workdays_between (int y1, int m1, int d1, int y2, int m2, int d2) {
        // write code here
        String start = y1+"-"+m1+"-"+d1;
        String end = y2+"-"+m2+"-"+d2;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Calendar day1 = Calendar.getInstance();
        Calendar day2 = Calendar.getInstance();
        try{
            day1.setTime(df.parse(start));
            day2.setTime(df.parse(end));
        } catch (ParseException e) {
            return 0;
        }
        int count = 0;
        while (day1.compareTo(day2)<0){
            System.out.println(day1.get(Calendar.DAY_OF_WEEK));
            if (day1.get(Calendar.DAY_OF_WEEK)!=7&&day1.get(Calendar.DAY_OF_WEEK)!=1)
                count++;
            day1.add(Calendar.DAY_OF_MONTH,1);
        }
        return count;
    }

    public static void main(String[] args) {
        int s = workdays_between(2020,9,25,2020,9,28);
        System.out.println(s);
    }
}
