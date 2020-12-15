
package Week3;


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
        
        // Swapping elements 0 and 2
        // use temp to store the 0th positon safely while we make the swap
        temp = array[0];
        
        // put last element of array as first
        array[0] = array[2];
        
        // take temps value (the old 0th element) and put it as last element
        array[2] = temp;
                
        
        // Array after swapping
        System.out.println("\nSwapped Array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Index " + i + " contains value of " + array[i]);
        }
    }
    
}
