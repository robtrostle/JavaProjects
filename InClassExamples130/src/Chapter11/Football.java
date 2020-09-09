
package Chapter11;

/**
 *
 * Sub class (child)
 */
public class Football extends SportsTeam{  
    
    private int lombardies = 6;
    
    public Football(){
        
    }
    
    public Football(String n, int d, int l){
        setSport("Football");  //This is using the parent method in SportsTeam
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
            System.out.println(getTeamName() + " is a " + getSports() + " team "
            + "founded on " + getDateFounded() + " with " + getLombardies() 
            + " lombardies.");
    }
    
}
