import java.util.Scanner;

public class PalidromNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        int temp=a;
        while(a!=0)
        {

            rev=rev*10+a%10;
            
            a=a/10;
        }
        if(rev==temp)
        {
            System.out.println("This Number is Palidrom Number  :  "+rev);
        }
        else
        {
            System.out.println("Theis Number Is NOT Palidrom Number  :  "+temp);
        }
        sc.close();
    }
   
    
}
