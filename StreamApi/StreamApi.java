package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> nums= Arrays.asList(5,8,9,2,3,4,2,4);
        System.out.println("Printing nums\n" + nums );

        int sum = 0;
        for(int n : nums)
            if(n%2 == 0)
                sum=sum+(n*2);
        System.out.println("Sum of even doubled numbers is: "+sum);

        System.out.println("\nPrinting of list in differnt ways");

        //for loop
        System.out.println("");
        for(int i=0; i<nums.size();i++)
            System.out.println(nums.get(i));

        //enhanced for loop
        System.out.println("\nenhanced for loop");
        for(int n : nums)
            System.out.println(n);

        //foreach
        System.out.println("\nFor Each");
        nums.forEach(n -> System.out.println(n));

        //expansion of lambda expression which is used above
        
        // Consumer<Integer> con =new Consumer<Integer>() {

        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };


        //printing the vales using stream
        System.out.println("\nPrinting the value using stream");
        Stream<Integer> s= nums.stream();
        s.forEach(n -> System.out.println(n));
        // s.forEach(n -> System.out.println(n));
        // the above line will through runtime error because once the stream has been operated can't be ooperated another time


        System.out.println("\nPrinting the doubled even nos");
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));
        System.out.print("\nSum of doubled Even numbers: ");
        sum = s3.reduce(0,(c,e) -> c+e);
        System.out.println(sum);



        //Expansin of filter/map

        // filter
        // inside the filter we can now pass the p
        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                
                return (n%2 ==0); //since the return type is boolean and our value outcome is also in boolean we can skip if else
            }
            
        };

        //map inside the map we can pass the fun
        Function <Integer, Integer> fun = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;                               
            }
            
        };

        System.out.println();
        sum = nums.stream()
                    .filter(p)
                    .map(fun)
                    .reduce(0, (c,e) -> c+e);
        System.out.println("Sum of doubled odd number: "+ sum);        

    }
}
