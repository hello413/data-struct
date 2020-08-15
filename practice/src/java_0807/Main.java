package java_0807;

public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("131 31 5");
        String s = str.toString().replaceAll(" ", "%20");
        System.out.println(s);
    }
}
