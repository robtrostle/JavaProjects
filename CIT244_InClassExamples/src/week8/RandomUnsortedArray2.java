
package Week8;

// By James Winyard

public class RandomUnsortedArray2 {
    
    // To be used to generate a random array with each sorting algorithm we create
    // Static so we do not have to create an object of the class every time we use it
    
    
    /**
     * Generates an unsorted array of random numbers based on users params
     * 
     * @param n - Size of the array
     * @param range - The range of numbers starting from 0, i.e. 10 = 0 - 9
     * @return 
     */
    public static int[] numbers(int n, int range)
    {
        int[] arr = new int[n];
               
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * range);
        }
        
        return arr;
    }
    
    // Generates an array of not random numbers (out of order),
    // so we can't make the argument that all arrays are randmon / different
    public static int[] notRandomNumbers(int n)
    {
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            if(i == 0)
            {
              arr[i] = n;
            }
            else if(i % 2 == 0)
            {
              arr[i] = n-i+1;  
            }
            else
            {
              arr[i] = n-i-1;  
            } 
        }
        
        return arr;
    }
    
}