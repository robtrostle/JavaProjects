
package Chapter10;


public class Student {
    
    private String name;
    private String major;
    private int credits;
    private static int numStudent;
    
    public Student() {
        numStudent++;
        name = "BLANK";
        major = "BLANK";
        credits = 0;
    }
    
    public Student(String n, String m, int c) {
        numStudent++;
        name = n;
        major = m;
        setCredits(c); //Credits will be changed to setCredits(c) because of the necessary if statement!!  

//Otherwise, someone could enter a junk value.  
    }
    
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public void setMajor(String m) {
        major = m;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setCredits(int c) {
        if(c < 0) {
            credits = 0;
        }
        else {
            credits = c;
        }
    }
    
    public int getCredits() {
        return credits;
    }
    
    @Override
    public String toString() {
        return "Student " + numStudent 
        + "\nStudent Name: " + name
        + "\nStudent Major: " + major
        + "\nStudent Credits: " + credits + "\n";
    }
    
}
