package Chapter9;


public class LabAssign2 {


   public static void main( String [] args )
  {
    // Declare and initalize variables
    double length = 1;
    double width = 1;
    
    // declare and iniatlize variables for calculations 
    double perimeter = 2 * width + 2 * length;
    double area = width * length;
    
    // neatly print output using variables so if they were changed the 
    // corresponding numbers would update in the program (show)
    System.out.println("The perimeter of a rectangle with a width of " + width
    + "and a length of " + length + " is "  + perimeter);
    
    System.out.println( "The area of a rectangle with a width of " + width
    + " and a length of " + length + " is "  + area);
  }
    
}
