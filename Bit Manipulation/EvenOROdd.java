import java.util.Scanner;
public class EvenOROdd {

    public static void evenOrOdd(int number){
        int bitmask = 1;
        if((number & bitmask) == 0){
            System.out.print("Even Number");
        }else{
            System.out.print("Odd number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}
