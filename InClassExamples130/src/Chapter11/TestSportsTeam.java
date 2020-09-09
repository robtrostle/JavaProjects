
package Chapter11;

/**
 *
 * @author robtr
 */
public class TestSportsTeam {

    
    public static void main(String[] args) {
        
        Football steelers = new Football("Steelers", 1933, 6);
        Soccer afcBournemouth = new Soccer("AFC Bournemouth", 1899, 0);
        
//        System.out.println(steelers);
//        System.out.println();
//        System.out.println(afcBournemouth);

            steelers.printFootball();
            afcBournemouth.printSoccer();
            
        
    }
    
}
