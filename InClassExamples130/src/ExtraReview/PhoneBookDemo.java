import java.util.Scanner;


/**
   * There may be syntax errors below 
   * When the PhoneBookEntry class is correctly completed,
   * these syntax errors will be corrected
   * This program demonstrates the use of an array to
   * store and retrieve data from the PhoneBookentry class.
   * Complete numbers 1, 2, 3, below
   * Practice Exam 2
*/
//Robert Trostle
//Practice exam 2

public class PhoneBookDemo
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int arraySize;
      PhoneBookEntry [] list;
      
      // Variables to hold a person's name phone number & age
        String name;
        String phoneNumber;
        int age;
        
        // Needed to display final output
        String output;
      
       do{
         // prompt user for entries
        System.out.print("How many names and phone numbers to enter: --> ");
        arraySize = scan.nextInt();
       }while(arraySize <= 0);

      // 1. Create an array to hold PhoneBookEntry objects using the variable 
      // that holds the user's response to the prompt above
            list = new PhoneBookEntry[arraySize];
      
      // for loop loads the array with PhoneEntry's constructor
      for (int i = 0; i < list.length; i++)
        {
            // Clear buffer
            scan.nextLine();
            // Get the data.
            System.out.print("\nEnter a person's name: ");
            name = scan.nextLine();
            System.out.print("Enter that person's phone number: ");
            phoneNumber = scan.nextLine();
            System.out.print("Enter that person's age: ");
            age = scan.nextInt();

             /* 2.
             * create a PhoneBookEntrey object using the input values 
             *  and store/load the object in the array
             */
             
             list[i] = new PhoneBookEntry(name, phoneNumber, age);
             
            
        }
       
            
      output = "\nHere's the data you entered:\n";
      
         /*
         * 3. loop below builds the output string
         * finish output += to be the current position of the list array
         * then create a new line
         */
         for (int i = 0; i < list.length; i++) {
            output += list[i] + "\n";
        }
         
       // Display the output
       System.out.println(output);
     
      
   }
   

}
