
package Week5;


public class ShiftingNumbers {

    
    public static void main(String[] args) {
        // our number (try chaning this to ensure
        String myNumber = "123";
        int shift = 6;
        //print original number
        System.out.println("Here is my number: " + myNumber);
        //print our desired shift
        System.out.println("Shifted " + shift + " places: ");
        //print the newly shifted number
        System.out.println(shiftDigits(myNumber, shift));
    }
    //Shifting method, takes original number and desired shift
    public static String shiftDigits(String myNumber, int shift)
    {
        char[] numbers = "0123456789".toCharArray();
        //to build new number (a string) 
        String shiftedNumber = "";
        //Pos of the current number we are sitting at 
        int numPos;
        //Pos of current char in the array (number)
        char currentChar;
        
        for (int i = 0; i < myNumber.length(); i++) 
        {
            //the currentChar (number) is = to the Ith pos
            currentChar = myNumber.charAt(i);
            //Read the below line of code backwards
            //the currentChar has an index of?? in the given array
            numPos = String.valueOf(numbers).indexOf(currentChar);
            //Add shift to the number at the given pos to get the NEW number
            //i.e. 1 shift 2 becomes 3
            int sum = numPos + shift;//for lab, use subtraction 
            //Add the shifted number to our String
            shiftedNumber += numbers[sum];
        }
        return shiftedNumber;
    }
}
