class Teacher{
    private String name;
    private int age;
    private String education;

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


}

public class Encapsulation {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        
        String name ="Urmi";
        String education ="Masters";
        int age = 24;

        obj.setAge(age);
        obj.setName(name);
        obj.setEducation(education);

        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getEducation());

    }
}
