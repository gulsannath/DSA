import java.util.Scanner;
public class CheckPowerOf2 {

    public static boolean checkPowerOf2(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        System.out.print("Is Power of 2:"+checkPowerOf2(num));
    }
}
