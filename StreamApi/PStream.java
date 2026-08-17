package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PStream {
    public static void main(String[] args) {
        
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        
        for(int i=0;i<=size;i++){
            nums.add(ran.nextInt(100));
        }
        // System.out.print(nums + ", ");


        //adding all the numbers by doubling it

        // one way
        int sum1 = nums.stream()
                        .map(n -> n*2)
                        .reduce(0,(c,e) -> c+e);


        System.out.println(sum1);  
                        
        // second way
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i -> {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i -> {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endPara = System.currentTimeMillis();
        
        System.out.println("Sum 2: " + sum2 +"\nSum 3: "+sum3);
        System.out.println("Timing for sequential Stream: " + (endSeq-startSeq));
        System.out.println("Timing for parallel Stream: " + (endPara-startPara));

    }

}
