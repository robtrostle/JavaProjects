
package Chapter10;

/**
 *
 * @author robert.trostle
 */
public class Pet {
    
    private String name;
    private int age;
    private double weight;
    public static int withoutName;//accumulator/counter
    
    public Pet(){
        name = "No name yet";
        age = 0;
        weight = 0;             //Take private variables and assign to public
        withoutName ++;        
    }   
    public Pet(String n, int a, double w){//Mr. Pickle Bottom
        name = n;
        setAge(a);//call setAge which will run it through the if statement
        setWeight(w);//same here
        
            //System.err.println("Invalid age or weight");          
    }
    
    public Pet(String n){
        
        name = n;
        age = 0;
        weight = 0;
        
    }
    public Pet(int a){
        
        name = "No name yet";
        if(a<0){
            age = 0;
        }else{
            age = a;
        }
        weight = 0;
        withoutName ++;
        
    }
    public Pet(double w){
        name = "No name yet";
        age = 0;
        if(w<0){
            weight = 0;
        }else{
            weight = w;                              
        }
        withoutName ++;
    }
    
    public void setName(String newName){
        
        name = newName;
        
    }
    
    public void setAge(int newAge){
        if(newAge<0){
            age = 0;
        }else{
            age = newAge;
        }      
    }
    public void setWeight(double newWeight){
        if(newWeight<0){
            weight = 0;
        }else{
            weight = newWeight;
        }       
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " years\n" +
                "Weight: " + weight + " pounds.";
    }
    
    
    
}
