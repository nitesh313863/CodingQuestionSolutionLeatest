import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String rev="";
        for(int i=0;i<=s.length()-1;i++)
        {
            rev=rev+s.charAt(s.length()-1-i);
        }
        System.out.println(rev);
        sc.close();
    }
    
}
