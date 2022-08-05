import java.util.Scanner;

class CountOccurrenceCharacterInString
{
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the Character : ");
        String s1=sc.nextLine();
        int count=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)==s1.charAt(0))
            {
                count++;
            }
        }
        System.out.println(s1.charAt(0)+": Is :"+" "+count);
        sc.close();
    }
}