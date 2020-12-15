package LinkedLists;
/*
Demonstrates without generics
*/

public class GenericExample2A {

    public static void main(String[] args) {
        
        int[] intArr = {1, 2, 3};
        char[] chArr = {'a', 'b', 'c'};
        String[] sArr = {"Words", "Are", "Stored", "Here"};
        
        loadAndPrint(intArr);
        loadAndPrint(chArr);
        loadAndPrint(sArr);
    }
    
    public static void loadAndPrint(int[] arr)
    {
        for (int e : arr) 
        {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
    
    public static void loadAndPrint(char[] arr)
    {
        for (char e : arr) 
        {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
    
    public static void loadAndPrint(String[] arr)
    {
        for (String e : arr) 
        {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
    
}