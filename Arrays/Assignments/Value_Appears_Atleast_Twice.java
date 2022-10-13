
import java.util.*;
public class Value_Appears_Atleast_Twice {

    public static boolean valueAtleastTwice(int numbers[]){
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            //O(n^2)
            // for(int j=i+1;j<numbers.length;j++){
            //     if(numbers[i] == numbers[j]){
            //         return true;
            //     }
            
            // }

            //O(n log n)
            if(numbers[i] == numbers[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,1};
        System.out.print(valueAtleastTwice(numbers));
    }
}
