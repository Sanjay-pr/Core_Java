package tools;


public class armstrongNumber {
    public static void main(String[] args) {
        int r, sum=0;
        int n=54748;
        int temp=n;
        int c=0;
        while(temp>0){
            r=temp%10;
            c++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            r = temp%10;
            sum+=Math.pow(r, c);
            temp/=10;
        }
        if(sum == n){
            System.out.println("It is an armstrong Number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
