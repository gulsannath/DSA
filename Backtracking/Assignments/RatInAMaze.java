
public class RatInAMaze {

    public static boolean isSafe(int maze[][], int row, int col){
        return(row>=0 && col>=0 && row<maze.length && col<maze.length && maze[row][col] == 1);
    }

    public static boolean findPathUtil(int maze[][], int sol[][], int row, int col){

        //Base Case
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            sol[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row, col)){
            sol[row][col] = 1;
            
            if(findPathUtil(maze, sol, row+1, col)){
                return true;
            }

            if(findPathUtil(maze, sol, row, col+1)){
                return true;
            }

            sol[row][col] = 0;
            return false;
        }

        return false;
    }

    public static void printSol(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void findPath(int maze[][], int n){
        int sol[][] = new int[n][n];
        if(findPathUtil(maze, sol, 0, 0)){
            printSol(sol);
        }else{
            System.out.println("Solution doesnot exists");
        }
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 1, 1, 0, 0 },
                         { 0, 1, 1, 1 } };
        
        int n =  maze.length;

        findPath(maze, n);
    }
}
