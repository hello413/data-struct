package java_0402;

import java.util.LinkedList;

public class Joseph {
    public int getResult(int n) {
        // write code here
        if (n<1){
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1;i <= n;i++){
            list.add(i);
        }
        int tem = 1;
        while (list.size()>1){
            tem++;
            int num = list.size(),j=0;
            for (int i = 0;i<num;i++){
                //当然可以写成i%tem+1!=0,这儿是省略了
                if (i%tem!=0){
                    list.remove(j);
                }else {
                    j++;
                }
            }
            if(list.size()>1){
                list.addFirst(list.removeLast());
            }
        }
        return list.remove(0);
    }

    public static void main(String[] args) {
        Joseph joseph = new Joseph();
        joseph.getResult(5);
    }
}