import java.util.Scanner;
public class Clear_ith_Bit {

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = sc.nextInt();
        System.out.print("Enter the no. of bit which you want to clear:");
        int i = sc.nextInt();
        System.out.print("The number "+number+" after clearing the "+i+"th bit becomes "+clearIthBit(number, i));
    }
}
