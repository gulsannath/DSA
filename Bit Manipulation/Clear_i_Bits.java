import java.util.Scanner;
public class Clear_i_Bits {

    public static int clearIBits(int n,int i){
        int bitMask = ~0<<i;
        return n&bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        System.out.print("Enter how many last bits You want to clear:");
        int i = sc.nextInt();
        System.out.print(clearIBits(num,i));
    }
}
