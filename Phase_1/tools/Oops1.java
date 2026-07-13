package tools;
//calculator using class and object

class Calculator{

    public Calculator(){
        System.out.println("In Calculator Class");

    }
    int a;
    int b;
    public int add(int n1, int n2){
        return(n1+n2);
    }
    public int sub(int n1, int n2){
        return(n1-n2);
    }
    public int mul(int n1, int n2){
        return(n1*n2);
    }
    public int div(int n1, int n2){
        return(n1/n2);
    }
}

public class Oops1 {
    public static void main(String [] args){
        Calculator calc = new Calculator();
        int x=10;
        int y=15;
        System.out.println("Sum of two numbers:"+calc.add(x, y));
        System.out.println("Difference of two numbers:"+calc.sub(x, y));
        System.out.println("Product of two numbers:"+calc.mul(x, y));
        System.out.println("Divison of two numbers:"+calc.div(x, y));
    }
    
}
