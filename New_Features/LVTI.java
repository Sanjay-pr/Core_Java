package New_Features;

// var is not allowed to create a class name
// class var{}


public class LVTI {

    // error var is not allowed here in instance variable
    // var num =10;
    public static void main(String[] args) {

        int a=10;
        var b=20;
        System.out.println(a +" : "+ b);

        // int c;

        // vaiable d without initializer error
        // var d;

        String var = "Sanjay";
        System.out.println(var);

        var nums = new int[10];
        nums[0] =10;


        //it is allowed
        // var lvtobj = new LVTI();  
        



        
    }
}
