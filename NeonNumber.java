import java.util.Scanner;

class NeonNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int count=0;

        int a=n*n;
        System.out.println(a);
        while(a!=0)
        {
            int temp=a%10;
            count=count+temp;
            a=a/10;
        }
        if(n==count)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        sc.close();
    }
}