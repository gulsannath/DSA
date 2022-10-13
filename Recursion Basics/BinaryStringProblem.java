import java.util.Scanner;
public class BinaryStringProblem {

    public static void binaryString(int n, int lastPlace, String binStr){
        //Base Case
        if(n==0){
            System.out.println(binStr);
            return;
        }
        binaryString(n-1, 0, binStr+"0");
        if(lastPlace == 0){
            binaryString(n-1, 1, binStr+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Binary Strings that You Want to Print:");
        int n = sc.nextInt();
        binaryString(n, 0, "");
    }
}
