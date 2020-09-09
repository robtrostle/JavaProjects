// This interface should be implemented into the TVShow class
package Chapter14;

/**
 *
 * @author Robert Trostle - Final Exam
 */
public interface TVShow_Interface {
    
    public String showName(String s);
    
    public int firstAired(int fa);
    public int lastAired(int la);
    
    public int yearsOnAir(int fa, int la);
    
    public String toString();
    
}
