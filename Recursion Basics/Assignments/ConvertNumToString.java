import java.util.Scanner;
public class ConvertNumToString {

    public static void numToString(int num){
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(num == 0){
            return;
        }

        int lastDigit = num%10;
        numToString(num/10);
        System.out.print(digits[lastDigit]+" ");  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        numToString(num);
    }
}
