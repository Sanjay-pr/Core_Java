class conditionalStatements {
    public static void main(String [] args){
        //greatest no. among 3
        int a=5;
        int b=8;
        int c=3;

        if(a > b && a > c){
            System.out.println("greatest no is: "+a);
        }
        else if(b > a && b > c){
            System.out.println("greatest no is: "+b);
        }
        else{
            System.out.println("greatest no is: "+ c);
        }
    }    
}
