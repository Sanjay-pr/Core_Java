class Abc{
    String penColor;    //Instance Variable
    public static void playMusic(){                     //this method can be called without using object
        System.out.println("Music is being played....");
    }

    //Method  Overloading
    public String pen(int cost){
        if(cost<=10){
            return "Not Enough Moaney";
        }
        else{
            return "Here is your pen";
        }

    }
    public String pen(int cost, String color)
    {
        if(cost>=20 && color==""){
            color=penColor;
            return (color+"Pen");
        }
        if(cost>=20 && color!=""){
            return (color+"Pen");
        }
        return "Pencil No Pen";
    }
}

public class Oops2 {
    public static void main(String[] args) {
        int x=10;
        Abc.playMusic();
        Abc obj = new Abc();
        Abc obj1 =new Abc();
        System.out.println(obj.pen(x));
        System.out.println(obj.pen(15, "Green"));

        obj1.penColor="Black";
        obj.penColor="Red";

        System.out.println(obj1.pen(25, ""));
        System.out.println(obj.pen(30, ""));      
    }
}
