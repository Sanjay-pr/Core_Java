package Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}


public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanjay", "Rahul", "Rui", "Kihu");
        List<Student> students = new ArrayList<>();
        List<Student> studs = new ArrayList<>();

        // creating the list of student object
        // one way

        // for(String name : names){
        //     students.add(new Student(name));
        // }

        // second way
        students = names.stream()
                        .map(name -> new Student(name))
                        .toList();
        
        //third way using constructor reference
        studs = names.stream()
                        .map(Student::new)  //connstructor refernce is the shortcut for lambda expression
                        .toList();
        
        System.out.println(students);
        System.out.println("\nUsing Constructor Refernce");
        System.out.println(studs);

    }
}
