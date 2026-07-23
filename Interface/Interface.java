package Interface;

interface A{

    int cost = 10000;       //this is final and static

    void show();
    void config();
}
interface B{
    void run();
}

// we can extend another interface only thing is 
// when we implements it we need to define its method and its parent interface as well
interface C extends B{
    void play();
}

// we can implements more thatn one interface in single class
class All implements A,C{
    public void show(){
        System.out.println("In Show");
    }
    public void config(){
        System.out.println("In Config");
    }
    public void run(){
        System.out.println("Running....");
    }
    public void play(){
        System.out.println("Playing....");
    }
}

public class Interface {
    public static void main(String[] args) {

        A obj = new All();
        obj.show();
        obj.config();

        // obj.run();       run is not known by A
        C obj1 = new All();
        obj1.run();
        obj1.play();
    }
    
}
