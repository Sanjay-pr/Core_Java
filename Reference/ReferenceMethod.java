package Reference;

import java.util.Arrays;
import java.util.List;

public class ReferenceMethod {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Sanjay","Raj","Saurav","Pranav");

        //converting the names in uppper case using stream labda expression in the map
        List <String> uNames = names.stream()
                                    .map(str -> str.toUpperCase())
                                    .toList();
                    
        System.out.println(uNames);


        List <String> lNames = names.stream()
                            .map(String::toLowerCase)  //here what we did is we needed to convert the each name into lower case by calling a method which belongs to string class so instead of using lambda we can use reference method
                            .toList();

        System.out.println(lNames);
    }
}
