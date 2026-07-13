class typeCastingConversion{
    public static void main(String [] args){


        //type casting int to byte (explicit)
        int b= 513;
        byte a = (byte)b;   //513 % 256 = output
        System.out.println(a);

        //type casting of float to int (explicit)
        float f= 3.143f;
        int x= (int) f;   //output =3
        System.out.println(x);

        //type conversion int to float (implicit)
        f= x;   // output is 3.0
        System.out.println(f);


        //type conversion byte to in (implicit)
        byte s=124;
        int i=s;
        System.out.println(i);

        //type promotion 
        byte m= 20;
        byte n=30;
        int result = m*n;
        System.out.println(result);


    }
}