package test;
public class Modifires {
    String name;
    private int marks;
    protected int roll;
    Long  phone;
    public Modifires(){
        name = "Sanjay";
        marks =99;
        roll = 1;
        phone = 7209048543l; 
    }

    public void show(){
        System.out.println("Name: "+ name);
        System.out.println("Marks: "+ marks);
        System.out.println("Roll: "+roll);
        System.out.println("Phone: "+ phone);
    }
    public static void main(String[] args) {

        Modifires obj = new Modifires();
        obj.name = "Sanjay";
        obj.marks = 99;
        obj.roll = 15;
        obj.phone = 7209048543l;
        obj.show();
    }
}

