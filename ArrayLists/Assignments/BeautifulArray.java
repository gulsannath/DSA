import java.util.*;
import java.util.ArrayList;

public class BeautifulArray {

    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();

            //for odd Case
            for(int ele: ans){
                if(2*ele-1 <= n){
                    temp.add(2*ele-1);
                }
            }

            //for even case
            for(int ele: ans){
                if(2*ele <= n){
                    temp.add(2*ele);
                }
            }

            ans = temp;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array you want to make beautiful:");
        int n = sc.nextInt();
        System.out.print("The beautiful array of size "+n+" is:"+beautifulArray(n));
    }
}
