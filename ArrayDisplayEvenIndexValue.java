
public class ArrayDisplayEvenIndexValue {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        for(int i=1;i<=arr.length-1;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" Even Index Value : "+arr[i]);
            }
            else
            {
                System.out.println(i+" Odd Index Value : "+arr[i]);
            }
        }
    }
    
}
