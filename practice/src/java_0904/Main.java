package java_0904;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        char[] arr = new char[N*N];
        for (int i=0;i<a;i++){
            arr[i] = 'a';
        }
        for (int i=a;i<a+b;i++){
            arr[i] = 'b';
        }
        for (int i=a+b;i<a+b+c;i++){
            arr[i] = 'c';
        }
        for (int i=a+b+c;i<a+b+c+d;i++){
            arr[i] = 'd';
        }
        Set<String> set = new HashSet<>();
        dfs(set,arr,0,arr.length);
        System.out.println(set.size());
    }

    private static void dfs(Set<String> set, char[] arr, int index, int length) {
        if (index==length){
            set.add(String.valueOf(arr));
            return;
        }
        for (int i = index;i<length;i++){
            if (i==index||arr[i]!=arr[index]) {
                swap(arr, i, index);
                dfs(set, arr, index + 1, length);
                swap(arr, i, index);
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
