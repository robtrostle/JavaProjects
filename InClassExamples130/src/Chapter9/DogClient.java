
package Chapter9;

public class DogClient {
    
    private String dogName;
    private String dogBreed;
    private String dogColor;
    int dogAge;
    boolean isTrained;
    
    // Default constructor (If creates blank object their dog will be as follows)
    public DogClient()
    {
        dogName = "N/A";
        dogBreed = "N/A";
        dogColor = "N/A";
        dogAge = 0;
        isTrained = false;
    }
    
    // OVERLOADED constructor (If the user creates an object with these values)
    // We give the dog those values
    public DogClient(String n, String b, String c, int a, boolean t)
    {
        dogName = n;
        dogBreed = b;
        dogColor = c;
        dogAge = a;
        isTrained = t;
    }
    
    // Create setters & getters for each private variable to allow it to leave
    // this private class
    
    // Name
    public void setName(String name)
    {
      dogName = name;  
    }
    
    public String getName()
    {
        return dogName;
    }
    
    // Breed
    public void setBreed(String breed)
    {
      dogBreed = breed;  
    }
    
    public String getBreed()
    {
        return dogBreed;
    }
    
    // Color
    public void setColor(String color)
    {
      dogColor = color;  
    }
    
    public String getColor()
    {
        return dogColor;
    }
    
    // Age
    public void setAge(int age)
    {
        dogAge = age;
    }
    
    public int getAge()
    {
        return dogAge;
    }
    
    // Trained
    public void setTrained(boolean trained)
    {
        isTrained = trained;
    }
    
    public boolean getTrained()
    {
        return isTrained;
    }
    
    // Print all elements of the dog object
    @Override
    public String toString()
    {
        return "Dog Name: " + dogName + 
                "\nDog Breed: " + dogBreed + 
                "\nDog Color: " + dogColor + 
                "\nDog Age: " + dogAge + 
                "\nTrained Is: " + isTrained + "\n";
    } 
}
