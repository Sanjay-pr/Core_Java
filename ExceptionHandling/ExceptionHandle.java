package ExceptionHandling;

public class ExceptionHandle {

    public static void main(String[] args) {
        
        int n=10;
        int d=5;
        int result;
        int num[]= new int[4];
        String str= null;


        try 
        {
            result = n/d;
            d=num[2];
            d=str.length();
            System.out.println(d);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Error Can't divide by zero :");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array value out of limit");
        }
        catch(Exception e){
            System.out.println("Something went Wrong..."+e);
        }

    }
    
}
