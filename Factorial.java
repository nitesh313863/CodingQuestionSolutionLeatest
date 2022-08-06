import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a=sc.nextInt();
        int fac=1;
        for(int i=a;i>=1;i--)
        {
            fac=fac*i;
        }
        System.out.println("Factoral : "+fac);
        sc.close();
    }
    
}
