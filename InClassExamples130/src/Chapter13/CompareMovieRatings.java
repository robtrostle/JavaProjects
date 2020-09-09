
package Chapter13;

/**
 *
 * @author robtr
 */
public class CompareMovieRatings {

    
    public static void main(String[] args) {
        
        Movie starWars = new Movie("Star Wars", 8);
        Movie frozen = new Movie("Frozen", 5);
        
        //starWars.compareTo(frozen);
        
        int difference = starWars.compareTo(frozen);
        System.out.println("\nThe difference in the rating is: ");
        System.out.println(difference);
    }
    
}
