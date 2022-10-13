import java.util.Scanner;
public class SwappingNumbersUsingXOR {

    public static void swappingNumbers(int a, int b){   
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("The value of a after swapping is:"+a);
        System.out.print("The value of b after swapping is:"+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        swappingNumbers(a, b);
    }
}
