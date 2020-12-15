
package Week3;

/**
 *
 * @author robtr
 */
public class NamesArray2D_One {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String[][] fullName = new String[4][2];//4 row 2 col
        //row 0, col 0
        fullName[0][0] = "Tom";
        fullName[0][1] = "Smith";
        fullName[1][0] = "Cathy";
        fullName[1][1] = "Swan";
        fullName[2][0] = "Sam";
        fullName[2][1] = "Simpson";
        fullName[3][0] = "John";
        fullName[3][1] = "Brown";
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
