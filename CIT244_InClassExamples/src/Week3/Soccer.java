
package Week3;

/**
 *
 * @author robtr //another child class
 */
public class Soccer extends SportsTeam{
    
    private int PLT;
    
    public Soccer(){
        
    }
    public Soccer(String n, int d, int p){
        setSport("Football");
        setTeamName(n);
        setDateFounded(d);
        PLT = p;
    }
    public int getPLT()
    {
        return PLT; 
    }

    public void setPLT(int PLT) {
        this.PLT = PLT;
    }
    public void printSoccer(){
        System.out.println(getTeamName() + " is " + getSport() + " team "
        + " founded on " + getDateFounded() + " with " + getDateFounded() + 
                " PLT.");
}
}