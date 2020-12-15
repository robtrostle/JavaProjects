
package Week3;

import java.util.Scanner;

/**
 *
 * @author robtr
 */
public class TicTacToe3 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int row, col;
        char[] players = {'x','o'};
        char player;
        int count = 0;
        
        
        
        // create a 2d board
        String [][] board={
        {null, null, null},
        {null, null, null},
        {null, null, null}
    };//print original blank board
        printBoard(board);
        do{
        //update board with player movement
        System.out.print("Enter your desired ROW (0-2)--> ");
        row = scan.nextInt();
        System.out.print("Enter your desired COLUMN (0-2)--> ");
        col = scan.nextInt();
        
        //Determine which players turn it is
        if(count%2==0)
            player = players[0];//if it's even, the character is X
        else
            player = players[1];//Else, they're O
        //update board with player and input
        board = updateBoard(board, player, row, col);
        //print the updated board
        printBoard(board);
        //increments to next player x>o, etc
        checkForWin(board, player, row, col);
       count++;
        }while(count < 9);
       //Game over(Todo: Determine winner)winning combnations method would do
        System.out.println("Game over, but I still don't know who won! ");
 
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
        
        if(ub[r][c]==null)//if the row and column are empty
        {
            ub[r][c] = "["+p+"]";//assign p to that spot (x or o)
        }
        else
        {
            System.err.println("\n\nInvalid move.\nGame ending." 
                    + "\nPlayer " + p + " forfits");
            System.exit(0);
        }
        return ub;
    }
    public static String[][] checkForWin(String[][] ub, char p, int r, int c){
        
//        if(ub[0][0] != "x" && ub[0][1] != "x" && ub[0][2] != "x")
//        {
//            System.out.println("Somebody won!!");
//            System.exit(0);
//        }
            
        return ub;
    }
}
