
package Chapter14;

/**
 *
 * @author Robert Trostle - Final Exam
 */
public class TVShow implements TVShow_Interface {
    
    private String name;
    private int fAir;
    private int lAir;
    private int yoa;
    
    // 1. SEE LINE 27~
    // 2. 
    // 2A) Call showName, passing variable sn
    // 2B) Call firstAired, passing f
    // 2C) Call lastAired, passing l <--- (The LETTER L)
    // 2D) call yearsOnAir, passing f & l <--- (The LETTER L)
    // 2E) Using a System.out.println() print toString(); HINT: this.
    public TVShow(String sn, int f, int l) 
    {
        showName(sn);
        firstAired(f);
        lastAired(l);
        yearsOnAir(f,l);
        System.out.println(toString());
        //put thread to sleep so other thread can catch up. 
        try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    
    // 1.
    // Create the missing method that TVShow_Interface requires
    // **Hint**: private = public
@Override
    public String showName(String s){
        name = s;
        return name;
    }

    // 3. IF fa is greather than the 2020, assign variable fAir to the 
    // 2020, ELSE private = public
    @Override
    public int firstAired(int fa) {
           
        if (fa > 2020){
            fAir = 2020;
        }else{
            fAir = fa;
        }
        return fAir;
    }

    // 4. IF la is less than or equal to  the 2020, then private = public
    //    ELSE assign lAir to the 2020
    @Override
    public int lastAired(int la) {
        
        if(la <= 2020){
            lAir = la;
        }else{
            lAir = 2020;
        }
        return lAir;   
    }

    // 5. Assign yoa to the difference between the two dates 
    @Override
    public int yearsOnAir(int fa, int la) {
        
        yoa = la - fa;
        
        if (la < fa){
            System.err.println("First Aired date cannot be greater than"
                    + " last aired date.");
            yoa = 0;          
        }//put thread to sleep so the other thread can catch up. 
        try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return yoa;
    }

    // 6. Change the return to neatly display output shown in instructions image
    @Override
    public String toString() 
    {
        return name + " first aired in " + fAir + " and ended in " + lAir +
                "\nWhich means it was on air for a total of " +
                yoa + " years. \n";
    }
    
    // ***********************SEE PAPER INTRUCTIONS FOR NEXT STEP(S)***********
    
    
}
