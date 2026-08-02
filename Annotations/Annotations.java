package Annotations;

//Deprecated means that soon this is going to be removed or there is and updated class available
// @Deprecated
class A{
    private String name="Sanjay";
    
    public void showTheContentOfThisClass(){
        System.out.println("Name:" + name);
    }
}
class B extends A{
    private int age =24;

    //override it says that function has been overridden
    @Override
    public void showTheContentOfThisClass(){
        System.out.println("Age: "+age);

    }
}


public class Annotations{
    public static void main(String args[]){

        B obj = new B();
        obj.showTheContentOfThisClass();
    }
}