import java.util.Scanner;
public class CountContiniousSubarrayStartingEndingwithSameLetter {

    public static int countStr(String str,int i, int j, int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res = countStr(str, i+1, j, n-1)+countStr(str,i,j-1,n-1)-countStr(str, i+1, j-1, n-2);
        
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.next();
        int start = 0;
        int end = str.length()-1;
        System.out.print("The total no. of SubStrings starting and ending with same character is:"+countStr(str,start,end,str.length()));
    }
}
