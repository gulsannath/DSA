import java.util.Scanner;
public class PrintNumbersInDecreasingOrder{

    public static void printNumbersInDecreasingOrder(int n){
        if(n<=0){
            return;
        }
        else{
            System.out.print(n+" ");
            printNumbersInDecreasingOrder(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range:");
        int range = sc.nextInt();
        printNumbersInDecreasingOrder(range);
    }
}