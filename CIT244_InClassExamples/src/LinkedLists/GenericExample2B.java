package LinkedLists;
/*
    Demonstrates WITH generics
*/

public class GenericExample2B {

    public static void main(String[] args) {
        
        // Generics only works with objects, so we must wrap our primitive data types
        //int[] intArr = {1, 2, 3};
        //char[] chArr = {'a', 'b', 'c'};
        
        // Wrapped primitive types
        Integer[] intArr = {1, 2, 3};
        Character[] chArr = {'a', 'b', 'c'};
        
        String[] sArr = {"Words", "Are", "Stored", "Here"};
        
        // Now we can use the SAME method on all data types isntead of overloading
        loadAndPrint(intArr);
        loadAndPrint(chArr);
        loadAndPrint(sArr);
    }
    
    // We are doing here what took 3 or more overloaded methods previously
    // T = Type
    public static <T> void loadAndPrint(T[] arr)
    {
        for (T e : arr) 
        {
            System.out.println(e + ", ");
        }
        System.out.println("");
        
    }
    
    
}