class CountNumberOfCharacterInString
{
public static void main(String[] args) {
    String s="My Name Is Nitesh Yadav.";
    int count=0;
    for(int i=0;i<=s.length()-1;i++)
    {
        if(s.charAt(i)==' ')
        {
            continue;
        }
        else
        {
            count++;
        }
    }
    System.out.println(count);
}
}