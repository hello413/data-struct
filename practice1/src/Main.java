
import java.util.*;

public class Main {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        in.nextLine();

        while (count-- > 0){
            String str = in.nextLine();
            if (isSeem(str)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean isSeem(String str) {
        int len = str.length();
        if (len%3 != 0){
            return false;
        }

        int index = 0;
        List<String> strings = new ArrayList<>();
        while (index < str.length()){
            strings.add(str.substring(index,index+3));
            index += 3;
        }
        Map<Integer,Character> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            if (strings.get(0).charAt(i) == strings.get(1).charAt(i)){
                map.put(i,strings.get(0).charAt(i));
            }
        }

        return isCun(strings,map)?true:false;
    }

    private static boolean isCun(List<String> strings, Map<Integer, Character> map) {

        for (int i = 2; i < strings.size(); i++) {
            for (Map.Entry<Integer,Character> m:map.entrySet()){
                if (strings.get(i).charAt(m.getKey()) != m.getValue()){
                    return false;
                }
            }
        }

        return true;
    }
}
