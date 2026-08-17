package OptionalClss;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sanjay", "Raj", "Tulsi","laxmi");

        Optional <String> name = names.stream()
                                        .filter(str -> str.contains("x"))
                                        .findFirst();
        // System.out.println(name.get());
        // the above statement may throw and exception when string not found
        // enhanced

        System.out.println(name.orElse("Not Found"));

        //different way if we don't want to use the optional class
        String nam = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not Present");
        
        System.out.println(nam);
    }
}
