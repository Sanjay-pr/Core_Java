import tools.AdvCalc;

class Scientific extends AdvCalc {
    int num1;
    int num2;

    Scientific(){
        this(5);
        System.out.println("In Scientific Calc");
        num1=0;
        num2=0;
    }
    Scientific(int n){
        //super();   this method is used automatically either you call it or not
        System.out.println("In Scientific Parameterized Constructor");
    }
    public double logarithm(double n){
        return (Math.log10(n));
    }

    //method overriding from Oops1.java class Calculator
    public int add(int n1, int n2){
        return ((n1+n2)*(n1-n2));
    }
}
public class Inheritance{
    public static void main(String[] args) {
        
        Scientific adv = new Scientific();
        int n1=10;
        int n2=15;
        //from parent's parent
        System.out.println("Subtraction of two Numbers: "+ adv.sub(n1, n2));

        //from parent class 
        System.out.println("Power of the number "+ adv.power(n1, 2));

        //from object class
        System.out.println("Log base 10 "+ adv.logarithm(1000));

        //method overriding
        System.out.println("New addition of two number: " + adv.add(n1, n2) );

    }
}