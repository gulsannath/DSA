import java.util.Scanner;
import java.util.*;
public class KeypadCombinations {

    public static List<String> printCombinations(String digits){

        List<String> result = new ArrayList<>();

        HashMap<String, String> map = new HashMap();
        map.put("2", "abc");map.put("3", "def");map.put("4", "ghi");
        map.put("5", "jkl");map.put("6", "mno");map.put("7", "pqrs");
        map.put("8", "tuv");map.put("9", "wxyz");
        
        Deque<String> deque = new ArrayDeque<>();
        deque.add("");
        
        for(int i=0; i<digits.length(); i++){
            String num = digits.substring(i, i+1);
            String charFromMap = map.get(num);
            int n = deque.size();
            
            for(int j=0; j<n; j++){
                String pull = deque.pollFirst();
                
                for(int k=0; k<charFromMap.length(); k++){
                    String temp = pull.concat(charFromMap.charAt(k)+"");
                    deque.add(temp);
                }
            }
        }
        
        while(!deque.isEmpty()){
            result.add(deque.poll());
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digits between 2 to 9 both inclusive:");
        String digits = sc.next();
        System.out.print("All the combinations are:"+printCombinations(digits));
    }
}
