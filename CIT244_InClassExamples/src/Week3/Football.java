
package Week3;

/**
 *
 * @author robtr Child Class
 */
public class Football extends SportsTeam {
    
    private int lombardies = 6;
    
    public Football(){
        
    }
    
    public Football(String n, int d, int l){
        
        setSport("Football");
        setTeamName(n);
        setDateFounded(d);
        lombardies = l;
    }
    
    public int getLombardies(){
        return lombardies;
        
    }
    public void setLombardies(int l){
        lombardies = l;
    }
    public void printFootball(){
        System.out.println(getTeamName() + " is " + getSport() + " team "
        + " founded on " + getDateFounded() + " with " + getLombardies() + 
                " lombardies.");
    }
    
}
