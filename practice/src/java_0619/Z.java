package java_0619;

class X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}

class Y{
    public Y(){
        System.out.println("Y");
    }
}

public class Z extends X{
    Y y = new Y();

    public Z(){
        System.out.println();
    }

    public static void main(String[] args) {
        new Z();
    }
}
