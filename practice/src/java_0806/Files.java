package java_0806;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class file{
    private String name;
    private String file;
    public file(String name,String file){
        this.name=name;
        this.file=file;
    }

    @Override
    public String toString() {
        return "file{" +
                "name='" + name + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}

public class Files {
    public static Map<String, ArrayList<file>> find(String pathName) throws IOException {

        //获取pathName的File对象
        File dirFile = new File(pathName);
        Map<String, ArrayList<file>> map = new HashMap<>();
        //判断该文件或目录是否存在，不存在时在控制台输出提醒
        if (!dirFile.exists()||!dirFile.isDirectory()) {
            throw new RuntimeException("资源目录不存在或者该目录是个文件");
        }

        //获取此目录下的所有文件名与目录名
        String[] fileList = dirFile.list();

        for (int i = 0; i < fileList.length; i++) {
            //遍历文件目录
            String string = fileList[i];

            //File("documentName","fileName")是File的另一个构造器
            File file = new File(dirFile.getPath(), string);
            System.out.println(dirFile.getPath());
            String name = file.getName();

            //如果是一个目录，输出目录名后，进行递归
            if (file.isDirectory()) {
                //递归
                find(file.getCanonicalPath());
            } else {
                String type = name.split("\\.")[1].toLowerCase();
                //如果是文件，则直接输出文件名
                if (type.equals("jpg")||type.equals("png")||type.equals("gif")){
                    ArrayList<file> list = map.getOrDefault("图片",new ArrayList<>());
                    list.add(new file(name,"/blog/img/"+name));
                    map.put("图片",list);
                }else if (type.equals("mp4")||type.equals("avi")){
                    ArrayList<file> list = map.getOrDefault("视频",new ArrayList<>());
                    list.add(new file(name,"/blog/img/"+name));
                    map.put("视频",list);
                }else {
                    ArrayList<file> list = map.getOrDefault("文本、压缩包或者其他格式",new ArrayList<>());
                    list.add(new file(name,"/blog/img/"+name));
                    map.put("文本、压缩包或者其他格式",list);
                }
//                System.out.println(name);
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<file>> map = find("D:\\Javaweb\\test\\blog\\src\\main\\webapp\\img");
        for (String i:map.keySet()){
            System.out.println(i);
            for (file j:map.get(i)){
                System.out.println(j.toString());
            }
        }
    }
}
