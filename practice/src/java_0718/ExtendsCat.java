package java_0718;

class Animal {
    public String name;
    public int id;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }


    public Animal() {
        System.out.println("an");
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }
}

public class ExtendsCat extends Animal{

    public ExtendsCat(String myName, int myid) {
        super(myName, myid);
    }
    public ExtendsCat() {
        System.out.println("en");
    }
    @Override
    public void eat(){
        System.out.println(name+"正在吃子类的");
    }
    public void sleep(){
        System.out.println(name+"正在shui子类的");
    }
    static{
        a=5;
//        System.out.println(a);
    }
    static int a;




    public static void main(String[] args) {
        System.out.println(new ExtendsCat().a);
//        Animal a = new ExtendsCat("小猫",1);
//        ExtendsCat eat = (ExtendsCat)a;
//        eat.sleep();
    }

}
