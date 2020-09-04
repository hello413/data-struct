package java_0903;

import java.util.*;

public class asdasd {

    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(3,'a');
        map.put(5,'b');
        map.put(4,'c');

        out(map);
    }

    private static void out(Map<Integer, Character> map) {
        Set<Integer> set = map.keySet();
        int max = Integer.MIN_VALUE;
        for(Integer s:set){
            if (s > max){
                max = s;
            }
        }

        StringBuilder[] sbs = new StringBuilder[map.size()];
        List<Character> list = new ArrayList<>();
        int index =0;
        for(Map.Entry<Integer,Character> m:map.entrySet()){
            StringBuilder sb = new StringBuilder();
            Integer key = m.getKey();
            for (int i = 0; i < max - key; i++) {
                sb.append(" ");
            }
            for (int i = 0; i < key; i++) {
                sb.append("#");
            }
//            sb.append("#"+m.getValue());
            list.add(m.getValue());
            sbs[index++] = sb;
        }

        for (int i = 0; i < max ; i++) {
            for (int j = 0; j < map.size(); j++) {
                if (j == map.size()-1){
                    System.out.println(sbs[j].charAt(i));
                }else {
                    System.out.print(sbs[j].charAt(i)+" ");
                }
            };
        }

        for (int i = 0; i < map.size() * 2 - 1; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < map.size(); i++) {
            if (i == map.size()-1){
                System.out.println(list.get(i));
            }else {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
