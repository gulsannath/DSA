import java.util.Scanner;
public class KnightsTour {

    public static void printKnightsTour(int [][]chess, int n, int row, int col, int move){

        //Base Case
        if(row < 0 || col < 0 || row >= n || col >= n || chess[row][col] != 0){
            return;
        }

        else if(move == n*n-1){
            chess[row][col] = move;
            printBoard(chess);
            // chess[row][col] = 0; // for all possible moves
            return;
        }

        chess[row][col] = move;
        //Recursion
        printKnightsTour(chess, n, row-2, col+1, move+1);
        printKnightsTour(chess, n, row-1, col+2, move+1);
        printKnightsTour(chess, n, row+1, col+2, move+1);
        printKnightsTour(chess, n, row+2, col+1, move+1);
        printKnightsTour(chess, n, row+2, col-1, move+1);
        printKnightsTour(chess, n, row+1, col-2, move+1);
        printKnightsTour(chess, n, row-1, col-2, move+1);
        printKnightsTour(chess, n, row-2, col-1, move+1);

        chess[row][col] = 0;
        
    }

    public static void printBoard(int [][] chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length or size of the chess:");
        int n =sc.nextInt();
        System.out.print("Enter the row no:");
        int row = sc.nextInt();
        System.out.print("Enter the col no:");
        int col = sc.nextInt();

        int chess[][] = new int[n][n];

        printKnightsTour(chess, n, row, col, 0);   
    }
}
