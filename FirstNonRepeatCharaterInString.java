import java.util.Scanner;

public class FirstNonRepeatCharaterInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        for(int i=0;i<=s.length()-1;i++)
        {
            int s1=s.indexOf(s.charAt(i));
            int s2=s.lastIndexOf(s.charAt(i));
            if(s1==s2)
            {
                System.out.print("  "+s.charAt(i));
                break;
            }

        }
        sc.close();
    }
}
