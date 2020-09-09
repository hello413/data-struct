package java_0905;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        long s = new Main5().getPasswordCount("123");
        System.out.println(s);
    }

    public static int numberofprize(int a, int b, int c) {
        // write code here
        int min = Math.min(Math.min(a, b), c);
        int count = min;
        a = a - min;
        b = b - min;
        c = c - min;
        int size = 0;
        if (a==0)size++;
        if (b==0)size++;
        if (c==0)size++;
        count+=(a+b+c)/(size*2);
        return count;
    }
    public long getPasswordCount (String password) {
        if (password==null||password.length()<2){
            return 9;
        }
        // write code here
        Set<String> set = new HashSet<>();
        for (int i=0;i<10;i++) {
            String str=""+i;
            getCount(password, 1,str,set);
        }
        if (set.contains(password))set.remove(password);
        return set.size();
    }

    private void getCount(String password, int index, String str, Set<String> set) {
        if (index==password.length()-1){
            int num = Integer.parseInt(password.charAt(index)+"");
            int before = Integer.parseInt(str.charAt(index-1)+"");
            double temp = (num+before)/2.0;
            String m = str;
            if ((int)temp!=(int)(temp+0.5)){
                str+=(int)(temp+0.5);
                set.add(str);
            }
            m+=(int)(temp);
            set.add(m);
            return;
        }
        int num = Integer.parseInt(password.charAt(index)+"");
        int before = Integer.parseInt(str.charAt(index-1)+"");
        double temp = (num+before)/2.0;
        String m = str;
        if ((int)temp!=(int)(temp+0.5)){
            str+=(int)(temp+0.5);
            getCount(password,index+1,str,set);
        }
        m+=(int)(temp);
        getCount(password,index+1,m,set);
    }

    public int getHouses (int t, int[] xa) {
        // write code here
        int[] arr = new int[xa.length/2];
        int[] brr = new int[xa.length/2];
        int j=0,k=0;
        for (int i=0;i<xa.length;i++){
            if (i%2==0){
                arr[j++]=xa[i];
            }else {
                brr[k++]=xa[i];
            }
        }
        int[] c = new int[xa.length/2];
        int count = 0;
        for (int i=1;i<xa.length/2;i++){
            c[i]= (arr[i]-brr[i]/2)-(arr[i-1]+brr[i-1]/2);
            while (c[i]/t>0){
                count++;
                c[i]/=t;
            }
            count++;
        }
        return count+2;
    }
}
