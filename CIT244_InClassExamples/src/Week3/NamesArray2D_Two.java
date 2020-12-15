
package Week3;

/**
 *
 * @author robtr
 */
public class NamesArray2D_Two {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] fullName = {
            {"Tom", "Smith"},
            {"Cathy", "Swan"},
            {"Sam", "Simpson"},
            {"John", "Brown"}
        };
        //length of the rows. 
        //System.out.println(fullName.length);
        
        //loop through the size of the array and print the index
        for (int i = 0; i < fullName.length; i++) 
        {//position i here is an array of size 2.
            //System.out.println(fullName.length);
            for (int j = 0; j < fullName[i].length; j++) 
            {
                System.out.println("array[ " + i + " ][ " + j + " ] = " 
                        + fullName[i][j]);
            }
        }
        
    }
    
}
