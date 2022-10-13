import java.util.Scanner;
public class PrintNumbersInIncreasingOrder {

    public static void printNumbersInIncreasingOrder(int n){
        if(n<=0){
            return;
        }
        else{
            printNumbersInIncreasingOrder(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range:");
        int range = sc.nextInt();
        printNumbersInIncreasingOrder(range);
    }
}
