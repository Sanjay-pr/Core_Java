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
        multiDimensional();
        System.out.println("\n*****Jagged arrays*****");
        jaggedArray();
        System.out.println("\n*****3D array*****");
        array3D();



    }

    public static void multiDimensional(){

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

    public static void jaggedArray(){
        int nums[][]= new int [4][];
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];
        nums[3]= new int[5];

        //let's print the blank array
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[i].length; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //assigning the value to jagged array
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[i].length; j++){
                nums[i][j]= (int)(Math.random()*10);
            }
        }

        //printing the assigned jagged arrays
        for (int i[]: nums){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void  array3D(){

        int nums[][][]=new int[4][3][2];
        // for(int i =0; i<nums.length;i++){
        //     int r= (int)(Math.random()*10);
        //     nums[i]=new int[r][];
        //     for(int j= 0; j<nums[i].length;j++){
        //         r= (int)(Math.random()*10);
        //         nums[i][j]= new int[r];
        //     }
        // }

        //printing 3d array
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k=0;k<nums[i][j].length;k++){
                    System.out.print(nums[i][j][k]+",");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        //assigning vaalue to 3d Array
        for(int i=0;i<4;i++){
            for(int j=0; j< 3;j++){
                for(int k=0;k<2;k++){
                    nums[i][j][k]=(int)(Math.random()*10);
                }
            }
        }

        //Printing assigned value of 3d array
        System.out.println("\n***printing 3d Array*****");
        for(int i [][] : nums){
            for(int j[] : i){
                for(int k:j){
                    System.out.print(k+",");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

