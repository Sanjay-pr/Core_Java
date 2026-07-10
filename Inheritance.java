class Scientific extends AdvCalc {
    int num1;
    int num2;

    Scientific(){
        num1=0;
        num2=0;
    }
    public double logarithm(double n){
        return (Math.log10(n));
    }
}
public class Inheritance{
    public static void main(String[] args) {
        
        Scientific adv = new Scientific();
        int n1=10;
        int n2=15;
        //from parent's parent
        System.out.println("Addition of two Numbers: "+ adv.add(n1, n2));

        //from parent class 
        System.out.println("Power of the number "+ adv.power(n1, n2));

        //from object class
        System.out.println("Log base 10 "+ adv.logarithm(1000));

    }
}