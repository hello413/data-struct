package java_0607;

class s{
    public s(){
        System.out.println("sss");
    }
    static {
        System.out.println("statuc sss");
    }
}

public class test extends s{
    public test(){
        System.out.println("aaa");
    }
    static {
        System.out.println("stsads 555");
    }

    public static void main(String[] args) {
        new test();
    }
}
