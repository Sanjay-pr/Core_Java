package New_Features;


//A sealed class can extend implemnts and permit subclass
sealed class A extends Thread implements Cloneable permits B,C{

}

//Sub class must extend sealed class 
//sub class either can be final/sealed/non-sealed
final class B extends A{

}

//a sealed class must have permits clause
sealed class C extends A permits E{

}


non-sealed class E extends C{

}


class F extends E{

}
// D lacks permits from C
// sealed class D extends C{}


// in case of interface sub interface must be either sealed or non sealed


public class Sealed {
    public static void main(String[] args) {
        
    }
}
