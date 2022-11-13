public class NQueensOnePossibleSolution {

        public static boolean isSafe(char board[][], int row, int col){
    
            //Vetical - Up
            for(int i=row-1;i>=0;i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }
    
            //Diagonal - left
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            
            //Diagonal - right
            for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
    
            return true;
        }
    
        public static boolean nQueens(char board[][], int row){
    
            //Base Case
            if(row == board.length){
                // printBoard(board);
                // count++;
                return true;
            }
    
            //column loop
            for(int j=0;j<board.length;j++){
                if(isSafe(board,row,j)){
                    board[row][j] = 'Q';
                    if(nQueens(board,row+1))//function call
                    {
                        return true;
                    }
                    board[row][j] = 'x';//Backtracking Step
                }
            }
            return false;
        }
    
        public static void printBoard(char board[][]){
            System.out.println("_____Chess Board_____");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    
        // static int count = 0;
        public static void main(String[] args) {
            int n=4;
            char board[][] = new char[n][n];
    
            //initialization
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j] = 'x';
                }
            }
    
            if(nQueens(board, 0)){
                System.out.println("Solution is possible for n = "+n+" queens");
                System.out.println("One Solution is:");
                printBoard(board);
            }else{
                System.out.println("The Solution is not Possible for n = "+n+" queens");
            }
    
            // System.out.println("The total no. of ways for Nqueens i.e, "+n+" Queens can be possible in the board is:"+count);
        }
}
