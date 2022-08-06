import java.util.Arrays;

class AnagramString
{
    public static void main(String[] args) {
       String s="Nitesh";
       String s1="Nitehsh";
       char[] ch=s.toCharArray();
       char[] ch1=s1.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
       boolean flag=false;
       if(ch.length!=ch1.length)
       {
        System.out.println("Not Anagram String");
        System.exit(0);
       }
       else
       {
            for(int i=0;i<=ch1.length-1;i++)
            {
                if(ch[i]!=ch1[i])
                {
                    flag=false;
                    break;
                }
                else
                {
                    flag=true;
                }
            }
       }
       if(flag==true)
       {
            System.out.println("Anagram String");
       }
       else
       {
        System.out.println("Not Anagram String");
       }
       
    }
}