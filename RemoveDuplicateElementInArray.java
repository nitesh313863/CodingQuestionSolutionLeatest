import java.util.Arrays;
public class RemoveDuplicateElementInArray {

    public static int removeDuplicate(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length-1;i++ )
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];     
        return j;
    }
    public static void main(String[] args) {
        int arr[]={50,40,50,40,20,10,20,10};
        Arrays.sort(arr);
        int length=RemoveDuplicateElementInArray.removeDuplicate(arr);
        for(int i=0;i<=length-1;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}
