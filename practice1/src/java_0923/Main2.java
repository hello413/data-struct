package java_0923;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] color = new char[n];
        String[] num = new String[n];
        for (int i=0;i<n;i++) {
            String str = in.next();
            color[i] = str.charAt(0);
            num[i] = str.substring(1, str.length());
        }
        int colorsize = 1;
        for (int i=0; i<color.length-1;i++){
            if (color[i]!=color[i+1]) {
                colorsize++;
                break;
            }
        }
        Map<String,Integer> map = new HashMap<>();
        int max = 0;
        for (String i: num){
            map.put(i,map.getOrDefault(i,0)+1);
            if (max<map.get(i))
                max = map.get(i);
        }
        Arrays.sort(num);
        String[] arr = {"A","K","Q","J","10"};
        Arrays.sort(arr);
        if (colorsize==1){
            if (isSame(num,arr)){
                System.out.println("HuangJiaTongHuaShun");
            }else if (map.containsKey("K")) {
                System.out.println("TongHuaShun");
            }else {
                System.out.println("TongHua");
            }
        }else {
            if (max==4){
                System.out.println("SiTiao");
            }else if (max == 3){
                if (map.size()==2){
                    System.out.println("HuLu");
                }else {
                    System.out.println("SanTiao");
                }
            }else if (max == 2){
                if (map.size()==3){
                    System.out.println("LiangDui");
                }else {
                    System.out.println("YiDui");
                }
            }else {
                System.out.println("GaoPai");
            }
        }
    }

    private static boolean isSame(String[] num, String[] arr) {
        for (int i=0;i<num.length;i++){
            if (!num[i].equals(arr[i]))
                return false;
        }
        return true;
    }
}
