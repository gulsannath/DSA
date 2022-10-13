import java.util.Scanner;
public class OptimizedPrintXTothePowerN {

    public static int optimizedPrintXtoThePowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPrintXtoThePowerN(x, n/2);
        if(n%2 != 0){
            return x*halfPower*halfPower;
        }
        else{
            return halfPower*halfPower;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value:");
        int x = sc.nextInt();
        System.out.print("Enter the exponent value:");
        int n = sc.nextInt();
        System.out.print(optimizedPrintXtoThePowerN(x,n));
    }
}
