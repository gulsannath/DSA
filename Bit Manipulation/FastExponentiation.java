import java.util.Scanner;
public class FastExponentiation {

    public static int fastExponentiation(int a,int N){
        int ans = 1;
        while(N>0){
            if((N & 1) != 0){
                ans *= a;
            }
            a *= a;
            N = N >> 1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Exponent:");
        int N = sc.nextInt(); 
        System.out.print("Ans:"+fastExponentiation(a, N));
    }
}
