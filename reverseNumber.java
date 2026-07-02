public class reverseNumber {
    public static void main(String[] args) {
        int x=9006;
        int rev=0;
        while(x>0){
            int r= x%10;
            rev=(rev*10) +r;
            x=x/10;
        }
        System.out.println("Reverse of the number: "+ rev);
    }
}
