
package Chapter11;

public class Fruit {
    
    private String type;
    
    public Fruit(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean equals(Fruit o) {//passes in an object. This is the way to 
        //write you own object comparison method. 
        
        System.out.println("First object: " + this.type);
        System.out.println("Second object: " + o.type);
        //return booleen expression (this object) comparing to fruit object. 
        return this.type.equalsIgnoreCase(o.type);
    }
    
    

}