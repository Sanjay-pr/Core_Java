package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set <Integer> nums = new HashSet<Integer>();
        nums.add(100);
        nums.add(1);
        nums.add(25);
        nums.add(512);
        // nums.add(-3);
        nums.add(52);

        System.out.println("Print set");
        System.out.println(nums);

        //printing set using for loop
        System.out.println();
        for (int n: nums) {
            System.out.println(n);
        }
        
        Set<Integer> num = new TreeSet<Integer>();
        num.addAll(nums);
        //print sorted aaray using treeset
        System.out.println();
        System.out.println("Print sorted Set");
        System.out.println(num);
        
        //printing using Iterator
        Iterator <Integer> values = num.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());            
        }

        
    }
}
