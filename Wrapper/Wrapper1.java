package Wrapper;

public class Wrapper1 {
    public static void main(String[] args) {
        int n= 10;

        //the below line will throw and error cause striked line means depreciated
        Integer num = 52;

        System.out.println(num);
        num = n;        //auto-boxing here we convert the primitive into object 

        System.out.println((num));
        int num2= num;

        System.out.println(num2);

        String str="457";
        int x= Integer.parseInt(str);
        System.out.println(x+3);
    }
}
