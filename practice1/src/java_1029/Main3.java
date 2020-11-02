package java_1029;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args){

        BufferedReader bfr = null;

        FileWriter out = null;

        try {
            //输入流
            FileReader read = new FileReader(" E:\\JAVA\\IDEAIU\\workSpace\\dataStructure\\src\\com\\tussy\\input.txt");

            //输出流
            out = new FileWriter("E:\\JAVA\\IDEAIU\\workSpace\\dataStructure\\src\\com\\tussy\\output.txt");

            //缓冲流
            bfr = new BufferedReader(read);

            //用list存储字符串
            ArrayList<String> list = new ArrayList<>();

            String line = null;

            //包装流可以读取一行
            while((line = bfr.readLine()) != null){
                System.out.println(line);
                list.add(line);
            }

            //调用排序方法
            Collections.sort(list);

            for(String str: list){

                out.write(str+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bfr != null){
                    bfr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(out != null){
                    out.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}