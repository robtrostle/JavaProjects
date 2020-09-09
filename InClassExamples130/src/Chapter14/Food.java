
package Chapter14;

/**
 *
 * Practice Exam 3 - Robert Trostle
 */
public class Food implements FoodInterface{
    
    String food;
    int ca;
    int ser;
    double calsPer;
    
    // 1. SEE LINE 23~
    
    // 2. 
    // 2A) Call foodName, passing variable fn
    // 2B) Call calories, passing c
    // 2C) Call servings, passing s
    // 2D) call caloriesPerServing, passing c & s
    // 2E) Using a System.out.println() print toString();
    
    public Food(String fn, int c, int s)
    {
       foodName(fn);
       calories(c);
       servings(s);
       caloriesPerServing(c,s);
        System.out.println(toString());
    }

    
    // 1.
    // Create the missing method that FoodInterface requires
    // **Hint**: private = public
    @Override
    public String foodName(String f){
        food = f;
        return food;
    }
    

    // 3. IF cal is less than 0 assign variable ca to 0, ELSE private = public
    @Override
    public int calories(int cal) {
        if(cal <0){
            ca = 0;
        }
        else{
            ca = cal;
        }
        return ca;
    }

    // 4. IF serv is less than or equal to 0 
    // assign variable ser to 1, ELSE private = public
    @Override
    public int servings(int serv) {
        if(serv <= 0){
            ser = 1;
        }else{
            ser = serv;
        }
        return ser;
    }


    // 5. Assign calsPer to (calories / servings) and then return the variable
    // **Hint:** these are methods!
    @Override
    public double caloriesPerServing(int cal, int serv) {
        calsPer = (double)cal/serv;
        return calsPer;
    }
    
    // 6. Change the return to neatly display output shown in instructions image
    @Override
    public String toString() {
        return food + ":" + "\nTotal " +
                ca + " calories for all " + ser +
                " servings " + "\nWhich means there are " + 
                calsPer + " calories per serving. \n"; 
    }
    
    // ***********************SEE PAPER INTRUCTIONS FOR NEXT STEP(S)***********
    
}
