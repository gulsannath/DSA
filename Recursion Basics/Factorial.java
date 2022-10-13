import java.util.Scanner;
public class Factorial {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to find its factorial:");
        int n = sc.nextInt();
        System.out.print("The factorial of "+n+" is:"+factorial(n));
    }
}
