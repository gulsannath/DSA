import java.util.Scanner;
public class TilingProblem {

    public static int tilingProblem(int n){
        //Base Case
        if(n==0 || n==1){
            return 1;
        }
        
        //Vertical Case
        int fnm1 = tilingProblem(n-1);

        //Horizontal Case
        int fnm2 = tilingProblem(n-2);

        //Total Ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the length of the Board(n):");
        int n = sc.nextInt();
        System.out.print("The total no. of ways that is possible to fit the tiles in the Board are:"+tilingProblem(n));
    }
}
