package Week2;

/**
 *
 * @author Robert Trostle Lab Assignment 2
 */
public class Friend {
    //declare global variable. 
    private String name;
    private int timeKnown;
    
    public Friend(String n, int tk)//friend constructor
    {
        name = n;
        timeKnown = validateTimeKnown(tk);
    }
    public int validateTimeKnown(int tk)
    {   //validate time know by assigning to zero by default if users enters neg
        if (tk <= 0)
        {
            timeKnown = 0;
        }else {
               timeKnown = tk;//else assign public to private. 
              }
        return timeKnown;
    }
    @Override
    public String toString(){
        return name + " and you have been friends for " 
                + timeKnown + " Year(s).";
    }
}
