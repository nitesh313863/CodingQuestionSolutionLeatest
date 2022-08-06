import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N Number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=n;i++)
        {
            if(i==a || i==b)
            {
                System.out.print("  "+i);
            }
            else
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
        sc.close();

    }
    
}
