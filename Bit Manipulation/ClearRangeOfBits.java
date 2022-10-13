import java.util.Scanner;
public class ClearRangeOfBits {

    public static int clearRangeOfBits(int n,int i,int j){
        int a = (~0) << (j+1);
        int b = (1<<i) - 1 ;
        int bitMask = a|b;
        return n&bitMask;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = sc.nextInt();
        System.out.print("Enter the ith bit:");
        int i = sc.nextInt();
        System.out.print("Enter the jth bit:");
        int j = sc.nextInt();
        System.out.print(clearRangeOfBits(num, i, j));
    }
}
