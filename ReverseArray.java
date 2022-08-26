
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        for(int i=0;i<=arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    
}
