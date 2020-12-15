
package Week3;

/**
 *
 * @author robtr
 */
public class TicTacToe2 {

    
    public static void main(String[] args) {
        // create a 2d board
        String [][] board={
        {null, null, null},
        {null, null, null},
        {null, null, null}
    };
        printBoard(board);
        //update board with player (x or o)
        board = updateBoard(board,'x', 0, 0);
        System.out.println();
        //print the update board with player
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
    }                                       //board     player   row    column
    public static String[][] updateBoard(String[][] ub, char p, int r, int c)
    {
        boolean filled = false;
        if(ub[r][c]==null)//if the row and column are empty
        {
            ub[r][c] = "["+p+"]";//assign p to that spot (x or o)
            filled = true;
        }
        return ub;
    }
}
