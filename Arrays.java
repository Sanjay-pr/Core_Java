public class Arrays {
    public static void main(String [] args){

        int a []={1,2,3,4};
        int b []= new int[4];

        for(int i=0; i<4; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        a[2]=10;

        for(int i=0; i<4; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("before assigning any value to b array");

        for(int i=0; i<4; i++)
        {
            System.out.print(b[i]+ " ");
        }
        System.out.println();

        System.out.println("assigned the value to 2nd array");
        b[0]=5;
        b[1]=51;
        b[2]=25;
        b[3]=36;

        for(int i=0; i<4; i++)
        {
            System.out.print(b[i]+ " ");
        }

    }
}
