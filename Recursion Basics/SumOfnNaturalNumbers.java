import java.util.Scanner;
public class SumOfnNaturalNumbers {

    public static int sumOfnNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumOfnNaturalNumbers(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range:");
        int n = sc.nextInt();
        System.out.print("The Sum of "+n+" Natural numbers is:"+sumOfnNaturalNumbers(n));
    }
}
