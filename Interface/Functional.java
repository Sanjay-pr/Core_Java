package Interface;


//A functional Interface without parameter and non return type
@FunctionalInterface
interface SingleAbstract{
    void show();
}

//A functional interface with parameter and no return type
@FunctionalInterface
interface SingleAbstract1{
    void Show(int a, String name);
}


@FunctionalInterface
interface ReturnType{
    int add (int i, int j);
}

class Implement implements SingleAbstract{
    public void show(){
        System.out.println("In Show");
    }
}


public class Functional{
    public static void main(String[] args) {

        //one way of creating obj and calling show method of interface class
        Implement obj = new Implement();
        obj.show();

        //Amother method by anonymous class
        SingleAbstract obj1=new SingleAbstract() {
            public void show(){
                System.out.println("In show with anonymous Class");
            }
        };
        obj1.show();


        //lambda Expression only possible with Single Abstract Method
        SingleAbstract obj2 = () -> System.out.println("In show using Lambda Expression");
        obj2.show();

        //lambda expression with parameter and no return type
        SingleAbstract1 obj3 = (a,name) -> System.out.println("Age: "+ a + " Name: " + name );
        obj3.Show(24, "Sanjay");

        
        //Annonymous class with return type
        ReturnType obj4 = new ReturnType() {
            public int add (int i, int j){
                int result = i+j;
                return result;
            }
        };
        System.out.println("Sum of two numbers:" + (obj4.add(12, 52)));

        //let's do lambda expressio with return type 
        ReturnType obj5 = (i, j) -> 
        {
            int result = i+j;
            return result;
        };
        System.out.println("Sum of two numbers: " + (obj5.add(12, 52)));

        //we can shorten above expression even more
        ReturnType obj6 = (i,j) -> i+j;
        System.out.println("Sum of two numbers: " + (obj6.add(12, 5)));

    }
}

