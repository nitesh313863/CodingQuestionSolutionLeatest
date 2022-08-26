public class ArrayDuplicateElement {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 5, 2, 0, 8, 8, 5};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                {
                    System.out.println(arr[j]); 
                }
            }
        }
    }
    
}
