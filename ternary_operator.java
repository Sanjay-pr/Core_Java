class ternary_operator {
    public static void main(String [] args){
        //greatest among two numbers
        int a =10;
        int b=15;
        int result = a>b ? a : b;
        System.out.println("greatest among two is:" + result);

        //greatest among 3
        int c= 12;
        result = a>b && a>c ? a : b>c ? b: c;
        System.out.println("Greatest among three is: "+result);

    }
}
