class Abc{
    public static void playMusic(){                     //this method can be called without using object
        System.out.println("Music is being played....");
    }
    public String pen(int cost){
        if(cost<=10){
            return "Not Enough Moaney";
        }
        else{
            return "Here is your pen";
        }

    }
}

public class Oops2 {
    public static void main(String[] args) {
        int x=10;
        Abc.playMusic();
        Abc obj = new Abc();
        System.out.println(obj.pen(x));
    }
}
