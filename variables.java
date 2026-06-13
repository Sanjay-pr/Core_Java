class variables
{
    public static void main(String [] args){
        int num1 =10;
        int num2 =20;
        int result= num1+num2;
        System.out.println("sum of two numbers: " + result);

        //declaration of float
        float a = 0.15f;  // while creating float we need to end the value with 'f'
        double d=0.15;

        //declaration of integer
        byte b=115;
        short s=9998;
        int x=55;
        long l=4985l;           // while creating long we need to end the value with 'l'

        //declaration of character
        char c= 'k';      //character is always in single code neither in double code nor open

        // declaration of boolean variable
        boolean bb=true;
        //boolean bbc=0; we can not declare 0 or 1 in java

        //display of each variables
        System.out.println("float :" + a);
        System.out.println("double: " + d);
        System.out.println("byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("integer: " + x);
        System.out.println("Long" + l);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " +bb);

        //literals

        int bin = 0b00110;  //it is binary so we have entered '0b' in the begining
        int hex = 0x7E;     //it is hexadecimal so we have entered '0x' in the begining
        int zeros= 1_00_00_00_000;  // when ther is long number we can add underscore

        System.out.println("binary: "+ bin);
        System.out.println("hexadecimal: "+ hex);
        System.out.println("long: "+ zeros);

        double dd= 13e11;   // here we used exponent 
        System.out.println("Exponent: "+ dd);

        //characters can also be used as integer
        char ch ='a';
        ch++;
        System.out.println(ch);  //It will give the output b

        char inch='1';
        inch++;
        System.out.println(inch); //It will output 2






    }
}