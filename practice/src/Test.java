class Base{
}

public class Test extends Base{
    private static int x=0;

    public static void main(String[] args) {
        Test x = new Test();
        x.x++;
        System.out.println(x.x);
    }

}
