package Inner_Class;


class Outer{
    Outer(){
        name="XYZ";
        age=24;
    }
    int age;
    String name;
    public void show(){
        System.out.println("From Outer Class");
        System.out.println("Name: " + name + " Age: "+age);
    }
    class Inner{
        Inner(){
            fathersName="ABC";
            mothersName="DEF";
        }
        String fathersName;
        String mothersName;
        public void showParent(){
            System.out.println("From Inner Class");    
            System.out.println("Father's Name: "+ fathersName);
            System.out.println("Mother's Name: " + mothersName);
        }
    }
    static class Inn{
        public void showStatic(){
            System.out.println("Hi I am Static inner class\nI don't need the object");
        }
    }
}


public class Test {
    public static void main(String[] args) {
        Outer out= new Outer();
        out.show();

        //here we are creating a object of inner class with the help of outer class object same like as methods
        Outer.Inner inn = out. new Inner();
        inn.showParent();

        //static inner class where object of outer class is not required
        Outer.Inn obj= new Outer.Inn();
        obj.showStatic();
    }
    
}
