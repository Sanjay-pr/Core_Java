package Polymorphism;
class A{
    void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    void show(){
        System.out.println("In B Show");
    }
}
class C extends A{
    void show(){
        System.out.println("In C show");
    }
}

class D{
    void show(){
        System.out.println("Hii from D Show");
    }
    void show(int t){
        System.out.println("D show value: "+ t);
    }
}

public class Dispatch{
    public static void main(String[] args) {

        //Dynamic Method Dispatch
        A ref;
        ref = new A();
        ref.show();

        ref = new B();
        ref.show();

        ref = new C();
        ref.show();;


        // Compile time polymorphism
        D obj = new D();
        obj.show();

        obj.show(0);

    }
}