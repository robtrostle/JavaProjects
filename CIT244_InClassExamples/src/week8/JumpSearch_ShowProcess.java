/*
JUMP SEARCH
Actually performs like a linear search but jumps in blocks which is why
we must have the array sorted. Once the element is > than what we are searching for
we take a step (jump) back and start the linear search from there, allowing us
to ignore or skip many elements we otherwise could not
 */
package Week8;

public class JumpSearch_ShowProcess {

    public static void main(String[] args) {
        
        // Array MUST be sorted (Interval search)
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610}; 
        int x = 1; 
        
        System.out.println("\nNumber " + x + " is at index " + jumpSearch(arr, x));
        
    }
    
    public static int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
        
        // Determine our step size (SQRT of n)
        int step = (int) Math.floor(Math.sqrt(n));
        System.out.println("We are going to JUMP in increments of " + step +"\n");
        
        // Keep track of previous jump
        int prev = 0;
        
        // While the current element is smaller than our X we keep jumping
        while(arr[Math.min(step, n)-1] < x)
        {
            // Show our next jumps value
            System.out.println("Our next jump takes us up to " + arr[step]);
            
            // Keep up of our LAST step
            prev = step;
            
            // Jump (or step) up again
            step += (int) Math.floor(Math.sqrt(n));
            
            // If our previous value is > than size of the array we've exhausted
            // our options and the element is NOT in the array
            if(prev >= n)
            {
                return -1;
            }
            // As soon as arr[step] > x AND not >= n we break the loop
        }
        
        // When we found a larger value and have to step back
        System.out.println("\nWe found a value larger than " + x + " at index "
                + step + " so let's back track to index " + prev + ""
                        + " and step in increments of 1.\n");
        
        // Time to do the linear search! (Creep up on the value)
        // jump back to previous (our last jump)
        while(arr[prev] < x)
        {
            System.out.println("Stepping gently ... " + arr[prev]);
            
            // If the ele is < than X we move up one
            // Becuase we know we're close!
            prev++;
            
            // We we reach the next block (jump) or end of the array
            if(prev == Math.min(step, n))
            {
                return - 1;
            }
            
        }
        
        if(arr[prev] == x)
        {
            System.out.println("Bingo!");
            return prev;
        } 
        
        // If we cannot find the value
        return -1;
    }
    
    
    
}