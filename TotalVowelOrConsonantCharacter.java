class TotalVowelOrConsonantCharacter
{
    public static void main(String[] args) {
        String s="NiteshYadav";
        int vowelCount=0;
        int consonantcount=0;
        s.toLowerCase();
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowelCount++;
            }
            else
            {
                consonantcount++;
            }
        }
        System.out.println("Vowel  Character  Count : "+vowelCount);
        System.out.println("Consonan Character  Count : "+consonantcount);
    }
}