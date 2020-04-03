package java_0402;

import java.util.ArrayList;
import java.util.List;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        List<Integer> asylum = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < ope.length; i++){
            if (ope[i][0] == 1){
                asylum.add(ope[i][1]);
            }else {
                if (asylum.isEmpty()){
                    result.add(null);
                    continue;
                }
                switch (ope[i][1]){
                    case 0:
                        int temp = asylum.remove(0);
                        result.add(temp);
                        break;
                    case 1:
                        for (Integer k :asylum){
                            if (k>0){
                                asylum.remove(k);
                                result.add(k);
                                break;
                            }
                        }
                        break;
                    case -1:
                        for (Integer k :asylum){
                            if (k<0){
                                asylum.remove(k);
                                result.add(k);
                                break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }
}