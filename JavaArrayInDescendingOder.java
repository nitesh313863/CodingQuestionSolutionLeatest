public class JavaArrayInDescendingOder {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-2-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print("  "+arr[i]);
        }

    }
}
