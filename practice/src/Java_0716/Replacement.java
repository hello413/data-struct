package Java_0716;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer sb = new StringBuffer(iniString);
        while(sb.indexOf(" ")!=-1){
            int index = sb.indexOf(" ");
            sb.replace(index,index+1,"%20");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello world";
        str = str.replaceAll(" ", "%20");
        System.out.println(str);
    }
}
