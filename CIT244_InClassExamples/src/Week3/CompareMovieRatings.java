
package Week3;

/**
 *
 * @author robtr
 */
public class CompareMovieRatings {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Movie starWars = new Movie("Star Wars", 8);
        Movie frozen = new Movie("Frozen", 10);
        
        starWars.compareTo(frozen);
        int difference = starWars.compareTo(frozen);
        System.out.println("\n The difference in the rating is: "
        + difference);
    }
    
}
