
package week7;


public class SwappingElements {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = new int [3];
        
        // Arrays are of finite size (meaning size cannot be changed once made)
        // So we need a temp variable if we are moving things around, otherwise you 
        // would lose a value
        int temp;
        
        array[0] = 1;
        array[1] = 5;
        array[2] = 9;
        
        System.out.println("Original Array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Index " + i + " contains value of " + array[i]);
        }
        
        // Use temp to store the 0th pos safely whilst we make the swap
        temp = array[0];
        
        // Make the swap
        array[0] = array[1];
        
        // Put temp in its new location
        array[1] = temp;
        
        System.out.println("\nAfter the Swap");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Index " + i + " contains value of " + array[i]);
        }
    }
    
}
    
    

