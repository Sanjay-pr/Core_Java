import test.*;
public class Modifires1 {
    public static void main(String[] args) {
        Modifires obj = new Modifires();
        // only public is accessible in different package non sub class
        obj.show();

        new Xyz().xyz();
    }
}
class Xyz extends Modifires{
    public void xyz(){
        Modifires obj  = new Modifires();
        // roll is accessible here but will not be updated as there is no setter
        roll =10;
        obj.show();
    }
}
