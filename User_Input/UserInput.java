package User_Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) throws IOException{
        int n;
        System.out.println("Enter the number:");


        //1st way of user Input using Buffered Reader
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        n = Integer.parseInt(br.readLine());
        System.out.println(n);
        
        // br.close();
        

        //2nd way of Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second number");;
        n= sc.nextInt();
        System.out.println(n);
        // sc.close();
        // br.close();


        //try with finally 
        System.out.println("Enter the Number");
        BufferedReader bf =null ;
        try{
            br= new BufferedReader(new InputStreamReader(System.in));
            n= Integer.parseInt(br.readLine());
            System.out.println(n);;
        }
        // finally is used for closing the resources
        finally{
            br.close();
        }

            //we can shorten the above statments by declaring inside try parenthesis
            // in this it automatically closes the resource BufferedReader once try gets executed
        // try(BufferedReader b =  new BufferedReader(new InputStreamReader(System.in))){
        //     n= Integer.parseInt(br.readLine());
        //     System.out.println(n);;
        // }


    }
}