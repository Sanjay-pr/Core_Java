package Final_keyword;


//once we declare our class as final class no other class can inherit it
final class Calculator{
    public void add(int a, int b){
        System.out.println("Sum of the two numbers: " + (a+b) );
    }
}


// the class Calculator can not be inherited into subclass
// class AdvCalculator extends Calculator{ }

class AdvCalculator{
    public final void show(){
        System.out.println("System created by Sanjay");
    }
    public void subtract(int a , int b){
        System.out.println(a-b);
    }
}

class Scientific extends AdvCalculator{
    // public void show(){
        //we can not override the show method cause it is deined as final method in parent class.
    // }

    public void subtracr(int a, int b){
        System.out.println(b-a);
    }
}

public class Final {
    public static void main(String[] args) {
        
        final double pi = 3.14;             //now we cannot change the value of pi it is constant now
        System.out.println("Pi value: "+pi);

        // the below line will throw an error
        // pi=1078;

        Calculator obj = new Calculator();
        obj.add(10, 15);


        AdvCalculator adv = new AdvCalculator();
        adv.show();
        adv.subtract(85, 15);
        adv = new Scientific();
        adv.show();
        adv.subtract(85, 15);

    }
    
}
