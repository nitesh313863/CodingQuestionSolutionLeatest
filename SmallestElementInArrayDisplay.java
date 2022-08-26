public class SmallestElementInArrayDisplay {
    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        int smallest=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element In Array : "+smallest);
    }
}
