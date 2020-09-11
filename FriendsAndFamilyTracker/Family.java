package Week2;

/**
 *
 * @author Robert Trostle Lab Assignment 2
 */
public class Family {
    private String name;
    private String relation;
    
    public Family(String n, String r)//simple family contstructor. 
    {
        name = n;
        relation = r;
    }  
    @Override
    public String toString(){
        return name + " is part of your family. The relationship is " 
                + relation + ".";
    }
}
