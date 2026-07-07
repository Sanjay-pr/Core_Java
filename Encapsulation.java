class Teacher{
    private String name;
    private int age;
    private String education;
    
    static String school;

    public Teacher(){               // default Constructor
        name="Sanjay";
        age=24;
        education="Graduate";
    }

    public Teacher(int age, String name, String education){         //parameterized Constructor
        this.age=age;
        this.education=education;
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setEducation(String education){
        this.education=education;
    }
    public String getEducation(){
        return education;
    }

    public void Show(){
        System.out.println(school);
        System.out.println(name+ " : " + age+ " : " + education);

    }


}

public class Encapsulation {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        System.out.println("Default Constructor Output");
        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getEducation());
        Teacher obj1= new Teacher(24,"Raj","Graduate");
        System.out.println("Parameterized Constructor Output");
        System.out.println(obj1.getName() + " : " + obj1.getAge() + " : " + obj1.getEducation());
        
        String name ="Urmi";
        String education ="Masters";
        int age = 24;

        obj.setAge(age);
        obj.setName(name);
        obj.setEducation(education);

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getEducation());


        Teacher.school="Holy Light";
        System.out.println("Displaying static keyword");
        obj.Show();

    }
}
