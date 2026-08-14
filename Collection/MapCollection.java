package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        
        Map <String, Integer> students = new HashMap<>();
        students.put("Sanjay", 95);
        students.put("Raj", 87);
        students.put("xyz", 55);
        students.put("abc", 95);
        students.put("Sanjay", 98);  //this will replace the value only from 95-98


        // printing all the students
        System.out.println(students);
        
        System.out.println("Value of Sanajay key: "+students.get("Sanjay"));
        System.out.println();

        //printing key sets
        System.out.println(students.keySet());


        System.out.println();
        for(String key : students.keySet()){
            System.out.println(key  + " : "+ students.get(key));
        }

        System.out.println();
        System.out.println("Printing all the values");
        System.out.println(students.values());
    }
}
