/**
  * The PhoneBookEntry class stores data about an phone book entry
  * Practice Exam 2
  * Robert T
  * Complete this class using UML diagram
*/
//Robert Trostle 
//Practice Exam 2 


public class PhoneBookEntry
{
    /**
    * 1. Create Instance variables, person's name and phone number
    */
   private String name;
   private String phoneNumber;
   private int age;

   /**
   *  2.  Constructor with parameters,
   *Assign values to name and phone number and call the setAge method passing a
   */
   public PhoneBookEntry(String n, String pn, int a)
   {
       name = n;
       phoneNumber = pn;
       age = a;
       
       setAge(a);              
   }
   
   
   /**
   *   setName method
   *   @param n The person's name.
   */
   public void setName(String n)
   {
      name = n;
   }

   /**
   *   setPhoneNumber method
   *   @param pn The person's phone number.
   */
   public void setPhoneNumber(String pn)
   {
      phoneNumber = pn;
   }
   
   /**
   *   3. setAge method
   *   @param a The person's age.
   *   method checks to see if the age is valid (>0) if this is the case then
   *  // age is set to a, otherwise a is set to 1
   */
   public void setAge(int a)
   {
       if (a <= 0){  //You must test the local variable because that is what
           age = 1;  //the user passes in. Then, age gets its value
       } else
           age = a;   
   }
   
   
   /**
    *  getName method
    *  @return The person's name.
    */
   public String getName()
   {
      return name;
   }
   
   
   /**
    *  getPhoneNumber method
    *  @return The person's phone number.
    */
    public String getPhoneNumber()
   {
      return phoneNumber;
   }
    
   /**
    *  getAge method
    *  @return The person's  age.
    */ 
   public int getAge()
   {
      return age;
   }
   
     /* 4.
     * this method displays a formatted text string with the values the
     * instance variables hold. See example of output for formatting
     */
    @Override
    public String toString( )
    {
        return "---------------------------\n"
                + "Name: " + name
                + "\nPhone #: " + phoneNumber
                + "\nAge: " + age; // written for syntax only, an error otherwise                
    }
   
}
