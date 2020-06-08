package java_0606;

public class Test {
    String string= new String("good");
    char[] chars = {'a','b','c'};

    public static void main(String[] args) {
        Test test =new Test();
        ex(test.string,test.chars);
        System.out.println(test.string+test.chars[0]);
    }

    private static void ex(String a, char[] b) {
        a="ss";
        b[0]='5';
    }
}
