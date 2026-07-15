package ObjectClass;

class Laptop extends Object{
    String model;
    int price;

    //Ide generated code for hascode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    //self created/override equals
    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }


    //overriding toString()
    // public String toString(){
    //     return model + " : " + price;
    // }

    //IDE generated code for .equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    
}

public class Object1 {
    public static void main(String[] args) {
        
        Laptop obj = new Laptop();
        obj.model = "Acer TravelMate";
        obj.price = 59_000;

        Laptop obj2 = new Laptop();
        obj2.model = "Acer TravelMate";
        obj2.price = 59_0001;

        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj2);

        System.out.println(obj.equals(obj2));

        boolean result = obj.equals(obj2);
        System.out.println(result);
    }    
}
