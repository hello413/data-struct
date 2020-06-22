package java_0622;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] arr = new boolean[p.length];
        int i=0;
        for (String x:p){
            arr[i++] = s.indexOf(x)==-1?false:true;
        }
        return arr;
    }
}
