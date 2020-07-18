package java_0717;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            Set<Character> set = new HashSet<>();
            for(char i:str2.toCharArray()){
                set.add(i);
            }
            StringBuffer sb = new StringBuffer(str1);
            for(char i:set){
                while(sb.indexOf(i+"")!=-1){
                    int index = sb.indexOf(i+"");
                    sb.delete(index,index+1);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
