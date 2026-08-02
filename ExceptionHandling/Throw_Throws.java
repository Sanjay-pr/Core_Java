package ExceptionHandling;

class StringException extends RuntimeException{
    StringException(){

    }
    StringException(String str){
        super(str);
    }

}

class A{

    //here we used throws ClassNotFoundException so now it's the caller duty to handle the exception
    public void show() throws ClassNotFoundException{
        Class.forName("ExceptionHandling.Throw_Throws");
    }
}

public class Throw_Throws {
    public static void main(String[] args) {
        
        String str="Sanjay";
        try{
            int l = str.length();
            if(l<=8){
                throw new StringException("Length of the string is vey short");
            }
        }
        catch(StringException s){
            System.out.println("Something went wrong ...." + s);
        }


        A obj = new A();

        //here we called the shows which throws the error so we need to handle it
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");;
        }
    }
}
