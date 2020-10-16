package java_1015;

import java.util.*;

public class Main {
    public boolean[] isBlackIp (String[] ipArr, String[] blackIpArr) {
        // write code here
        boolean[] arr = new boolean[ipArr.length];
        Set<String> list = new HashSet<>();
        for (String i:blackIpArr)
            list.add(i);
        for (int i =0;i<arr.length;i++)
            arr[i]=list.contains(ipArr[i]);
        return arr;
    }

    public static void main(String[] args) {
        String s = "While there is life, there is hope.";
        String[] a = {"hope", "here"};
        ArrayList<String> strings = new Main().filterSensitiveWords(s, a);
        for (String i:strings){
            System.out.print(i+" ");
        }
    }
    public ArrayList<String> filterSensitiveWords (String content, String[] sensitiveWords) {
        // write code here
        Set<String> set = new HashSet<>();
        int min = sensitiveWords[0].length();
        for (String i:sensitiveWords){
            if (i.length()<min)min=i.length();
            set.add(i);
        }
        ArrayList<String> list = new ArrayList<>();
        String[] split = content.split("\\s+");
        for (String i:split) {
            if (i.length() < min) continue;
            for (String j : set) {
                while (i.contains(j)) {
                    list.add(j);
                    int start = i.indexOf(j);
                    i = i.substring(0, start) + i.substring(start + j.length());
                }
            }
        }
        return list;
    }

    public int[] calculateStatistics (int[] dataArr) {
        // write code here
        Arrays.sort(dataArr);
        int[] arr = new int[4];
        arr[0] = dataArr[dataArr.length/2];
        arr[1] = dataArr[0];
        arr[2] = dataArr[dataArr.length-1];
        int index = (int)(0.9*dataArr.length);
        arr[3] = dataArr[index-1];
        return arr;
    }
}
