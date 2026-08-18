package New_Features;

// Creating a class with methods to carry the data
// the class alien is just created to store the valus
class Alien{
    private final int id;
    private final String name;

    //constructor to assign the value
    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter methods to get the value
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //to print the values
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }    
}


// record class can do all the operations of the above alien class
record Human (int id , String name){

    //Instance variables are not allowed here for instance variables we neeed to mentionit in brackets 
    //we can change the behaviour of the constructor here by using compact canonical constructor
    public Human{
        if(id ==0){
            throw new IllegalArgumentException();
        }
    }

}


public class RecordClass {
    public static void main(String[] args) {

        Alien a1= new Alien(1, "Sanjay");
        Alien a2 = new Alien(1, "Sanjay");

        System.out.println(a1.getName());
        System.out.println(a1.equals(a2));
        System.out.println(a1);

        Human h1 = new Human(5, "Human");
        Human h2 = new Human(6, "Tulsi");

        System.out.println(h1.equals(h2));
        System.out.println(h1);
        // to get the value we have the funtion based on the variable name
        System.out.println(h1.name());


        
    }
}
