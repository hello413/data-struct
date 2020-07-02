package java_0630;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String n = input.nextLine();
            String line = input.nextLine();
            String[] pcands = line.split(" ");
            for (String s:pcands){
                AddCandidate(s);
            }
            String m = input.nextLine();
            String line1 = input.nextLine();
            String[] votes = line1.split(" ");
            for (String vote:votes){
                Vote(vote);
            }
            int nums= 0;
            for (String i:map.keySet()){
                nums+=map.get(i);
                System.out.println(i+" : "+map.get(i));
            }
            System.out.println("Invalid : "+nums);
        }
    }

    private static Map<String,Integer> map = new TreeMap<>();
    public static int AddCandidate(String pCandidateName){
        if (pCandidateName == " ") {
            return 0;
        }

        if (!map.containsKey(pCandidateName)) {
            map.put(pCandidateName,0);
            return 1;
        } else {
            return 0;
        }
    }

    public static void Vote(String pCandidateName){
        if (map.containsKey(pCandidateName)) {
            int num = map.get(pCandidateName);
            map.put(pCandidateName,num+1);
        }
    }

    public static int GetVoteResult(String pCandidateName){
        if (map.containsKey(pCandidateName)) {
            return map.get(pCandidateName);
        } else {
            return -1;
        }
    }

    public static void Clear(){
        map.clear();
    }
}