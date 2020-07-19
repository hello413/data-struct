package java_0718;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern pattern = Pattern.compile("[a-zA-Z]{1}\\d+");
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        //对输入进行分割
        String[] split = string.split(";");
        //初始化坐标
        int x=0;
        int y=0;
        for(String sp:split){
            //验证输入的有效性
            Matcher matcher = pattern.matcher(sp);
            boolean matches = matcher.matches();
            if(!matches){
                continue;
            }
            String[] split1 = sp.split("");
            String string1 = split1[0];
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=1;i<split1.length;i++){
                stringBuilder.append(split1[i]);
            }
            String string2 = stringBuilder.toString();
            int i = Integer.parseInt(string2);
            switch (string1.toUpperCase()){
                case "A":{
                    x-=i;
                    break;
                }
                case "D":{
                    x+=i;
                    break;
                }
                case "W":{
                    y+=i;
                    break;
                }
                case "S":{
                    y-=i;
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.println(x+","+y);
    }
}


