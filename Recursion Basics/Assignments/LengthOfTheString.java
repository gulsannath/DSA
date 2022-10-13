import java.util.Scanner;
public class LengthOfTheString {

    public static int lengthOfString(String str,int i, int count){
        if(i==str.length()){
            return count;
        }
        return lengthOfString(str, i+1,count+1);

        // if(str.length() == 0){
        //     return 0;
        // }
        // else{
        //     return lengthOfString(str.substring(1))+1;
        // }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.next();
        System.out.print(lengthOfString(str,0,0));
    }
}
