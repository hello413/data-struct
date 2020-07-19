package java_0718;
class A{
    static int a;//类变量
    String name;
    int id;
    //静态代码块
    static{
        a=10;
        System.out.println("这是父类的静态代码块"+a);
    }
    //构造代码块
    {
        id=11;
        System.out.println("这是父类的构造代码块id:"+id);
    }
    A(){
        System.out.println("这是父类的无参构造函数");
    }
    A(String name){
        System.out.println("这是父类的有参构造函数name"+name);
    }
}
class B extends A{
    String name;
    static int b;
    static{
        b=12;
        System.out.println("这是子类的静态代码块"+b);
    }
    {
        System.out.println("这是子类的构造代码块id:"+id);
    }
    B(){
        System.out.println("这是子类的无参构造函数");
    }
    B(String name) {
        System.out.println("这是子类的有参构造函数name:"+name);
    }
}
class Node{
    public String i = null;

    final static int key;

    static{
        key = 2;
    }
//    public Node(int key){
//        this.key=key;
//    }
}
public class staticTest {
//    static {
//        a=5;
//    }
//    static int a = 2;

    public static void main(String[] args) {
//        B bb=new B();
        Node node1 = new Node();
        Node node2 = new Node();
        node1.i="123";node2.i="123";
        System.out.println(node1.i==node2.i);
//        System.out.println(i==a+i1);
//        node.arr[0]=2;
//        System.out.println(node.arr[0]);
        int ii = 128;
        short ss = 128;
        long ll = 128;
        char cc = 128;
        System.out.println(ii == ss);
        System.out.println(ii == ll);
        System.out.println(ii == cc);
//        System.out.println(a==b);
    }
}