import java.util.Scanner;
public class GridWays{

    public static int gridWays(int i, int j, int n, int m){
        //Base Case
        if(i==n-1 && j==m-1){//condition for last cell
            return 1;
        }
        if(i==n || j==m){//condition for boundary cross condition
            return 0;
        }

        //possible ways --> Down and Right
        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);//(down + Right)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows:");
        int n = sc.nextInt();
        System.out.println("Enter the no. of Columns:");
        int m = sc.nextInt();
        System.out.println("The total no. of possible unique ways are:"+gridWays(0,0,n,m));
    }
}