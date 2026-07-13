class Student{
    String name;
    int roll;
    int marks;

}
public class ArrayObj {
    public static void main(String [] args){
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();

        s1.name="Sanjay";
        s1.roll=8;
        s1.marks=88;

        s2.name="Raj";
        s2.roll=7;
        s2.marks=89;

        s3.name="Shreya";
        s3.roll=12;
        s3.marks=87;

        Student students [] = new Student[3];     // it will no create 3 objects for students 
        students[0] = s1;                         // 
        students[1] = s2;
        students[2] = s3;

        System.out.println(students[0]);       // this is just holding the refernece to s1 not actual data
        System.out.println(s1);               // it will print the above line i.e address of s1 object in heap memory

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : "+ students[i].marks);
        }

        System.out.println("printing with the for each loop");
        for(Student stud : students){
             System.out.println(stud.name + " : "+ stud.marks);
        }



    }
}
