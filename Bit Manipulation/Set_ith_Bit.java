import java.util.Scanner;
public class Set_ith_Bit {

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        System.out.print("Enter the no. of bit which You want to set:");
        int i = sc.nextInt();
        System.out.print("The "+num+" after setting the "+i+"th bit is: "+setIthBit(num, i));
    }
}
