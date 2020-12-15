
package Week3;


public class SportsTeam {
    
    private String sport;
    private String teamName;
    private int dateFounded;
    
    
    public SportsTeam(){
        
    }
    public SportsTeam(String s, String tn, int d){
        sport = s; 
        teamName = tn;
        dateFounded = d;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(int dateFounded) {
        this.dateFounded = dateFounded;
    }
    public String toString(){
        return "Team Name: " + teamName
                + "\nSport: " + sport
                + "\n Founded: " + dateFounded;
     }
}
