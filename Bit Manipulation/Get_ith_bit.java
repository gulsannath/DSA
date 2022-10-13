import java.util.Scanner;
public class Get_ith_bit {

    public static int get_ith_Bit(int num,int i){
        int bitmask = 1<<i;
        if((num & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.print("Enter the number of bit:");
        int i = sc.nextInt();
        System.out.print("The "+i+"th "+"bit of the "+n+" is "+get_ith_Bit(n, i));
    }
}
