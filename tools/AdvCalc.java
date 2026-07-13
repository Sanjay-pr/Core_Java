package tools;


public class AdvCalc extends Calculator{
    double a;
    double b;
    public AdvCalc(){
        System.out.println("In Adv Calc");
        a=0.0;
        b=0.0;
    }
    public double power(int n, int p){
        return(Math.pow(n, p));
    }
    public static void main(String[] args) {
        
    }
}
