package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        Collection <Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(104);
        nums.add(150);

        //printing collection 
        //one way
        System.out.println();
        System.out.println("Printing Nums Collection");
        System.out.println(nums);
        
        //another way 
        System.out.println();
        System.out.println("Printing Nums Collection using for each");
        for (int  n : nums) {
            System.out.println(n);            
        }
        
        //we can't print nums with index value
        // nums[2] / nums(2) / nums.get these are not available in collection
        
        List <Integer> num = new ArrayList<Integer>();
        
        num.add(78);
        num.add(7965);
        num.add(788);
        num.add(8);
        num.add(7);
        
        System.out.println();
        System.out.println("Printing num List");
        System.out.println(num);
        
        System.out.println();
        System.out.println("Printing num List index of 2");
        System.out.println(num.get(2));
        
        System.out.println();
        System.out.println("Printing num List using for each");
        for (int n : num) {
            System.out.println(n);            
        }

        System.out.println("Index of 8 is: "+num.indexOf(8));
        System.out.println("Does num contains 7965: "+num.contains(7965));


        
    }
    
}
