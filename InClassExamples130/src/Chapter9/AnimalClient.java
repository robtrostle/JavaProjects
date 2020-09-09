
package Chapter9;

/**
 *
 * @author robert.trostle
 */
public class AnimalClient {
    //these are global variables because they are class level variables. 
    private String species;
    private String name;
    private String sound;
    private int age;
    private double weight;
    
    public void setSpecies(String spec){//set method always void. will take a string of the same as the method
        species = spec;//by default, variables are public
    }
    public String getSpecies(){//will always return the private variable
        return species;
    }
    public void setName(String nam){
        name = nam;
    }
    public String getName(){
        return name;
    }
    public void setSound(String sou){
        sound = sou;
    }
    public String getSound(){
        return sound;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setWeight(double w){
        weight = w;
    }
    public double getWeight(){
        return weight;
    }
    @Override//allows user to see that you overrode a method. Basically a comment. 
    //made the method our own. We are overrided java's toSring method. 
    public String toString(){
        return name + " is a " + species + " which makes a sound of " + sound
                + ". Has an age of " + age + " and weighs " + weight + " pounds.";
    }
}