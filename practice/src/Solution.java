import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        for(int i=1;i<=n;i++){
            str+=i;
        }
        if(n>0){
            Permutation(str.toCharArray(),0,list,k);
        }
        Collections.sort(list);
        if(k<0||k>list.size()){
            return null;
        }
        return list.get(k-1);
    }
    void Permutation(char[] str,int start,ArrayList<String> list,int k){
        if(start == str.length-1){
            list.add(String.valueOf(str));
            return;
        }
        for(int i=start;i<str.length;i++){
            swap(str,i,start);
            Permutation(str,start+1,list,k);
            swap(str,i,start);
            if (start==0){
                if (list.size()>=k){
                    return;
                }
            }
        }
    }
    void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
//        String s = "  雷 ";
//        System.out.println(s.trim().length());
//        System.out.println(s.strip().length());
//        int i=5;
//        int a = (i++)+(++i)+(i--)+(--i);
//        System.out.println(i+" "+a);
        ArrayList<Object> objects = new ArrayList<>(6);
        System.out.println("初始长度:  "+objects.size() + " 初始容量： " + getArrayListCapacity(objects));
        System.out.println();

        for (int i=0;i<20;i++){
            objects.add(null);
            System.out.print("长度:  "+objects.size() + " 容量： " + getArrayListCapacity(objects)+"        ");
            if (i%5==4){
                System.out.println();
            }
        }
    }
    public static int getArrayListCapacity(ArrayList<?> arrayList) {
        Class<ArrayList> arrayListClass = ArrayList.class;
        try {
            Field field = arrayListClass.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = (Object[])field.get(arrayList);
            return objects.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
