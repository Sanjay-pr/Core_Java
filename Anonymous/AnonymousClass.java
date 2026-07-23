package Anonymous;

class Outer{
    public void show(){
        System.out.println("In Outer Show");
    }
}
abstract class Test{
    public abstract void config();
    public abstract void show();
}

public class AnonymousClass {
    public static void main(String[] args) {
        

        //Anonymous CLass
        Outer obj = new Outer(){
            public void show(){
                System.out.println("In new outer Show");
            }
        };
        obj.show();

        //Annonumous class for abstract class
        // Test obj1 = new Test();       This line is not allowed we cann not create a object of the abstract class
        Test obj1 = new Test() {
            public void show(){
                System.out.println("In abstract Show");
            }
            public void config(){
                System.out.println("In Abstract Config");
            }
        };

        //we can call show and config from obj1
        // we are not calling directly the object of abstract classrather we are exteding through anonymous class
        obj1.show();
        obj1.config();
    }
}
