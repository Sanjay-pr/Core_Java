package Abstract_Keyword;

abstract class Car{
    public abstract void drive();
    public abstract void engine();

    public void play(){
        System.out.println("Music is being played");
    }

}
class WagonR extends Car{
    public void drive(){
        System.out.println("He is Driving the car of Suzuki");
    }
    public void engine(){
        System.out.println("Engine Installed in wagonR is of Suzuki");
    }
}

abstract class BMW extends Car{
    public void drive (){
        System.out.println("BMW running");
    }
    public abstract void engine();
}
class Wolkswagen extends BMW{               //Concrete Class
    public void engine(){
        System.out.println("Engine provided to Bmw is up of Wolkswagen");
    }
}
public class Abstract {

    public static void main(String[] args) {

        //we cannot create the object of the abstract class
         
        WagonR wag = new WagonR();
        wag.drive();
        wag.engine();
        wag.play();

        Wolkswagen wolk = new Wolkswagen();

        wolk.drive();
        wolk.engine();
        wolk.play();
    }
    
}
