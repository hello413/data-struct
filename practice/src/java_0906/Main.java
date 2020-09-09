package java_0906;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String str = in.next();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<Integer, ArrayList<String>> map1 = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            int value = entry.getValue();
            ArrayList de = map1.getOrDefault(value, new ArrayList());
            de.add(entry.getKey());
            map1.put(value, de);
        }

        int i = 0;
        for (int key : map1.keySet()) {
            ArrayList<String> strings = map1.get(key);
            for (String s : strings) {
                System.out.println(s + " " + key);
                i++;
                if (i == K) break;
            }
            if (i == K) break;
        }
        for (int j = list.size()-1;j>=0;j--){
            Integer value = list.get(i).getValue();
            ArrayList<String> strings = map1.get(value);
            for (String s : strings) {
                System.out.println(s + " " + value);
                i--;
                if (i == 0) break;
            }
            if (i == 0) break;
        }
    }
}
