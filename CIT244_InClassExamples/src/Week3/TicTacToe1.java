
package Week3;

/**
 *
 * @author robtr
 */
public class TicTacToe1 {

    
    public static void main(String[] args) {
        // create a 2d board
        String [][] board={
        {null, null, null},
        {null, null, null},
        {null, null, null}
    };
        printBoard(board);
 
    }
    public static void printBoard(String[][]b){
        for (int r = 0; r < b.length; r++) //prints length of row
        {
            for (int c = 0; c < b[r].length; c++) {//prints leght of col
                   //if cell is empty
                if(b[r][c]==null)
                {
                    System.out.print("[ ]");
                }
                else
                {
                    System.out.print(b[r][c]);
                }
            }
            System.out.println();//After leaving nested for, print blank line
        }
    }
}
