import java.util.Scanner;
public class NthFibonacciNo {

    public static int nthFibonacciNo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return nthFibonacciNo(n-1)+nthFibonacciNo(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth position:");
        int n = sc.nextInt();
        System.out.print("The Nth Fibonacci Number is:"+nthFibonacciNo(n));
    }
}
