package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Names implements Comparable<Names>{
    int age;
    int standard;
    String name;
    public Names(int age, int standard, String name) {
        this.age = age;
        this.standard = standard;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Names [age=" + age + ", standard=" + standard + ", name=" + name + "]";
    }

    public int compareTo(Names n){
        if (this.age>n.age)
            return 1;
        else
            return  -1;
    }
}

class Students{
    int age;
    String names;
    public Students(int age, String names) {
        this.age = age;
        this.names = names;
    }
    @Override
    public String toString() {
        return "Students [age=" + age + ", names=" + names + "]";
    }    
}

public class SortCollection {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        }; 

        Comparator <String> nam = new Comparator<String>() {
            public int compare(String a, String b){
                if(a.length()>b.length())
                    return 1;
                else 
                    return -1;
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Sanjay");
        names.add("Raj");
        names.add("Tulsi");
        names.add("Saurav");



        List<Integer> num = new ArrayList<>();
        num.add(56);
        num.add(39);
        num.add(85);
        num.add(12);
        num.add(60);

        Collections.sort(num);
        System.out.println("Sorted value = "+num );

        //sorting using comparator
        Collections.sort(num, com);
        System.out.println("Sorting using Comparator: "+ num);

        //lets sort using the length of the String
        System.out.println();
        System.out.println(names);
        Collections.sort(names, nam);
        System.out.println("Sorting of names in terms of lenght of the names: " + names );

        Comparator<Students> st = new Comparator<Students>() {
            public int compare(Students a, Students b){
                if(a.age> b. age)
                    return 1;
                else
                    return -1;
            }
        };

        List <Students> studs = new ArrayList<>();
        studs.add(new Students(24, "Sanjay"));
        studs.add(new Students(21, "Tulsi"));
        studs.add(new Students(20, "Raj"));
        studs.add(new Students(18, "Saurav"));

        System.out.println();
        System.out.println("printing students" + studs);
        System.out.println();
        Collections.sort(studs,st);
        System.out.println("Printing sorted Students age wise");
        for(Students s : studs){
            System.out.println(s.names + " : " + s.age);
        }
        // Collections.sort(studs); It is not going to work because there is no compareTo method
        // present inside the Students Class


        List<Names> nameList =new ArrayList<>();
        nameList.add(new Names(12,1,"Rui"));
        nameList.add(new Names(5,2,"Rui"));
        nameList.add(new Names(8,3,"Rui"));
        nameList.add(new Names(10,4,"Rui"));
        System.out.println("\n Printing the List of the names: " +nameList);
        Collections.sort(nameList);
        // here .sort worked because we have defined compareTo in the class
        System.out.println("\nPrinting the list after sorting according to age"+ nameList);

    }
    
}
