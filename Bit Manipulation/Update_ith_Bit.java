import java.util.Scanner;
public class Update_ith_Bit {

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int updateIthBit(int n, int i,int newBit){
        n = clearIthBit(n,i);
        int bitMask = newBit << i;
        return n|bitMask;
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.print("Enter the no. of bit You want to Update:");
        int i = sc.nextInt();
        System.out.print("Enter the newBit that You want to update:");
        int newBit = sc.nextInt();
        System.out.print("The value of "+num+" after updating "+i+"th bit by "+newBit+" becomes:"+updateIthBit(num, i, newBit));
    }
}
