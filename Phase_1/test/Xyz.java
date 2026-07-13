package test;
public class Xyz {

    public static void main(String[] args) {
        Modifires obj = new Modifires();
        obj.name="Raj";
        //marks is not accesible here
        // obj.marks=88;
        obj.roll = 2;
        obj.phone =12345l;
        obj.show();
        
       new Zab().zab();
    
    }
    
}
class Zab extends Modifires{


    public void zab(){
        Modifires obj = new Modifires();
        obj.name = "Subham";
        obj.phone = 14567l;
        obj.roll = 50;
        obj.show();
        //marks is private so it not accessible here too
        // obj.marks=85;
    }

}