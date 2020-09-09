
package Chapter11;

/**
 *
 * @author robtr
 */
public class Soccer extends SportsTeam{
    
    private int PLT;//premiere league title
    
    public Soccer(){
        
    }
    
    public Soccer(String n, int d, int p){
        setSport("Soccer");
        setTeamName(n);
        setDateFounded(d);
        PLT = p;
    }
    
    public int getPLT(){
        return PLT;
    }
    
    public void setPLT(int p){
        PLT = p;
    }
    
    public void printSoccer(){
            System.out.println(getTeamName() + " is a" + getSports() + " team"
            + " founded on " + getDateFounded() + " with " + getPLT() 
            + " PLT.");
    }
    
}
