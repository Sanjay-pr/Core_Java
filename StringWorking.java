public class StringWorking {
    public static void main(String[] args) {
        String name="Sanjay Jaiswal";
        String s1="Sanjay";
        String s4="Sanjay";
        System.out.println(name==s1);               //gives false
        s1=s1+" Jaiswal";
        s4=(s4+" Jaiswal").intern();
        System.out.println(name == s1);             // giving false because in runtime it creates object in pool rather in heap
        System.out.println(name==s4);                 //gives true we used intern forced pooling in string constant pool
        String s2="Jaiswal";
        String s3 ="Jaiswal";
        System.out.println(s2 == s3);               // gives true


        StringBuffer sb= new StringBuffer("Sanjay Jaiswal");
        System.out.println("Capacity of String Buffer: "+sb.capacity());
        System.out.println("Length of the String Buffer"+sb.length());
        s3=sb.toString();
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println("Deleted one character: "+sb);
        sb.insert(3, "j");
        System.out.println("Inserting j back to it's deleted position: "+sb);


    }
}
