
package Chapter11;

public class FruitEquals {

    public static void main(String[] args) {
        
        Fruit strawberry = new Fruit("Strawberry");
        
        Fruit pineapple = new Fruit("Pineapple");
        
        Fruit strawberry2 = new Fruit("Strawberry");
        
        // Pineapple is NOT a Strawberry
        System.out.println(strawberry.equals(pineapple));
        System.out.println("");
        
        // Strawberry IS a strawberry (Because it is the SAME strawberry)
        System.out.println(strawberry.equals(strawberry));
        System.out.println("");
        
        // Strawberry IS NOT a strawberry (Because it is NOT THE SAME strawberry)
        System.out.println(strawberry.equals(strawberry2));
        
        // update with overridden equals method - rerun
        
    }
    
}