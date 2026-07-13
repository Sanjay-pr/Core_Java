public class floydTriangle {
    public static void main(String[] args) {
        int s=1;
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
