package java_0413;

import java.util.*;

public class Solution01 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String str: words){
            Integer num = map.get(str);
            if (num==null){
                map.put(str,1);
            }else {
                map.put(str,num+1);
            }
        }
        List<String> candidates = new ArrayList(map.keySet());
        Collections.sort(candidates, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        return candidates.subList(0, k);
    }
}
