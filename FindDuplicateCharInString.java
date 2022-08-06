// Enter the String : 
// niteshnitesh 
// n found 2 times
// i found 2 times
// t found 2 times
// e found 2 times
// s found 2 times
// h found 2 times

import java.util.Scanner;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count;
        for(int i=0;i<=s.length()-1;i++)
        {
            count=1;
            char c=s.charAt(i);
            if(c==' ')
            {
                continue;
            }
            for(int j=i+1;j<=s.length()-1;j++)
            {
                if(c==s.charAt(j))
                {
                    count++;
                s=s.substring(0,j)+s.substring(j+ 1);
                }
            }
            if(count > 1) {
                System.out.println(c + " found " + count + " times");
              }
        }
        sc.close();
        
        
    }
    
}
