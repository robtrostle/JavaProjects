
package Chapter10;

public class MusicianClient {
    
    private String name;
    private int members;
    private String type;
    private String bestHit;
    
    public MusicianClient() {
        name = "Unknown";
        members = 0;
        bestHit = "Unknown";
        type = "INVALID";
    }
    
    public MusicianClient(String n, int m, String bh) {
        name = n;
        setType(m);
        members = m;
        bestHit = bh;
    }
    
    // Setters
    public void setName(String n) {
        name = n;
    }
    
    public void setType(int m) {
        if(m < 1) {
            type = "Invalid";
        }
        else if(m == 1) {
            type = "Solo";
        }
        else if(m == 2) {
            type = "Duo";
        }
        else if(m == 3) {
            type = "Trio";
        }
        else if(m >= 4 && m <= 10) {
            type = "Group / Band";
        }
        else {
            type = "Way too many people";
        }
    }
    
    public void setBestHit(String bh) {
        bestHit = bh;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public String getBestHit() {
        return bestHit;
    }
    
    @Override
    public String toString() {
        return name + " is a " + type + " act with " 
        + members + " members whose best hit is " + bestHit + ".";
    }
}
