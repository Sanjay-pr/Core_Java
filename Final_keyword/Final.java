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
    public void mul(int a, int b){
        System.out.println(a*b);
    }
}

class Scientific extends AdvCalculator{
    // public void show(){
        //we can not override the show method cause it is deined as final method in parent class.
    // }

    public void subtract(int a, int b){
        System.out.println(b-a);
    }
    public void addition(int a, int b){
        System.out.println(a+b);
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


        //Downcasting and Upcasting

        //UpCasting
        //in the below object creation we created object of sub-class(Scientiific) but refernce of super class
        AdvCalculator obj1= new Scientific();
        System.out.print("Multiply from Upcasting: ");
        //with obj1 we cannot access addition function which is in subclass
        obj1.mul(10, 5);

        //Downcasting
        //here we are casting superclass refernce to subclass 
        //from obj2 we can access the function of sub class as well as super class since the refernce has been changed to subclass
        Scientific obj2= (Scientific) obj1;

        System.out.print("additiion from downcasting: ");
        obj2.addition(5, 10);


    }
    
}
