

public class PalidromString {
    public static void main(String[] args) {
        String s="aba";
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("String is Palidrom : "+s);
        }
        else
        {
            System.out.println("String Not aPalidrom : "+s);
        }
    }
    
}
