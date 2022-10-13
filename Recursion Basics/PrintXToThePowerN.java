import java.util.Scanner;

public class PrintXToThePowerN {

    public static int printXToPowerN(int x, int n){
        if(n == 0){
            return 1;
        }
        else{
            return x*printXToPowerN(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        int x = sc.nextInt();
        System.out.print("Enter the exponent:");
        int n = sc.nextInt();
        System.out.print(x+"^"+n+"="+printXToPowerN(x, n));
    }
}
