class LargestElementInArrayDisplay
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int largest=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest Element In Array : "+largest);
    }
}