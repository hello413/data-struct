class Base{
    public Base(String s){
        System.out.println("B");
    }
}

public class Test extends Base{
    public Test(String s) {
        super(s);
        System.out.println("d");
    }

    public static void main(String[] args) {
        s();
    }
    public static void x(){
        s();
        System.out.println("221");
    }
    public void s(){
        x();
        System.out.println("22");
    }
}
