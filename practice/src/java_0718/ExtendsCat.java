package java_0718;

class Animal {
    private String name;
    protected int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }


    public Animal() {
        System.out.println("an");
    }

    private void eat(){
        System.out.println(name+"正在吃");
    }
}

public class ExtendsCat extends Animal{

    public ExtendsCat(String myName, int myid) {
//        super(myName, myid);
    }
//public ExtendsCat() {
//    System.out.println("en");
//}
    public void sleep(){
        System.out.println("正在睡");
    }

    public static void main(String[] args) {
        new ExtendsCat();
    }
}
