class operators {
    public static void main(String[] args){
        int num1= 25;
        int num2= 10;

        //arithmetic operators
        int add= num1+num2;
        int sub= num1-num2;
        int mul= num1 * num2;
        double div = num1 / num2;
        int rem = num1 % num2;
        System.out.println("add: "+add);
        System.out.println("sub: "+sub);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        System.out.println("rem: "+rem);
        
        // short hand operator
        num1 += 2;
        System.out.println(num1);
        num1 -= 2;
        System.out.println(num1);
        num1 *= 2;
        System.out.println(num1);
        num1 /= 2;
        System.out.println(num1);
        num1 %= 2;
        System.out.println(num1);

        //increment decrement

        int num=5;
        int result = ++num;  // prefix increment first increment then fetch
        System.out.println(result);
        num =10;
        result = num++; //post fix increment
        System.out.println(result);

        //Relational operators

        int a=10;
        int b=5;
        int e=5;

        boolean res=true;

        res= a<b;
        System.out.println(res);  //false

        res= a>b;
        System.out.println(res);   //true

        res= a<=b;
        System.out.println(res);   //false

        res= a>=b;
        System.out.println(res);   //true

        res= a!=b;
        System.out.println(res);   //true

        res= b==e;
        System.out.println(res);   //true



        // logical operator

        int m = 5;
        int n = 7;
        int o = 9;
        int p = 11;

        boolean bol = m <
         n && o < p;   //5 < 7 tru && 9< 11 true 
        System.out.println(bol);        //true

        bol = m < n || o >p;            // 5 < 7 || 9 > 11  false
        System.out.println(bol);        // true 

        System.out.println(!bol);   //false

    }
}