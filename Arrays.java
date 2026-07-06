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
        System.out.println();
        System.out.println("******Multi Dimesnional array");
        MultiDimensional();

    }

    public static void MultiDimensional(){

        int nums[][]= new int[3][4];


        System.out.println("Printing the data after declartion of array");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("assigned random value to the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }

        System.out.println("lets print new values");

        for(int m[] : nums){
            for(int n : m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
