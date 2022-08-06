import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean flag=false;
        if(n==0 || n==1)
            {
                flag=false;
            }
        for(int i=2;i<=n/2;i++)
        {
            
           if(n%i==0)
            {
                flag=true;
                break;
            }
            
        }
        if(flag==true)
            {
                System.out.println(" This Number Not Prime Number");
            }
            else
            {
                System.out.println("This Number Is Prime Number");
            }
            sc.close();
    }
    
}
