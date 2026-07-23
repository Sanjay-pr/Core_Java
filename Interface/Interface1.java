package Interface;

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code Build Run with laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Codr Build Run Faster with Desktop");
    }
}

class Developer{
    public void devApp(Computer com){
        com.code();
        System.out.println("Coding ........");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sanjay = new Developer();
        sanjay.devApp(desk);

        sanjay.devApp(lap);
    }    
}
