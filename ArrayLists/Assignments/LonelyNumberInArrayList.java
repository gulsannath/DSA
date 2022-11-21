import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumberInArrayList {

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();

        //if only one element is present in the list
        if(list.size() == 1){
            ans.add(list.get(0));
            return ans;
        }

        //if only two element is present in the list
        if(list.size() == 2 && list.get(1)-list.get(0) > 1){
            ans.add(list.get(0));
            ans.add(list.get(1));
            return ans;
        }

        //for 3 or more element present in the list
        for(int i=1;i<list.size()-1;i++){
            
                if(i-1 == 0 && list.get(i)- list.get(i-1) > 1){
                    ans.add(list.get(i-1));
                }
                if(i+1 == list.size()-1 && list.get(i+1)- list.get(i) > 1){
                    ans.add(list.get(i+1));
                }
                if(list.get(i)- list.get(i-1) > 1 && list.get(i+1)- list.get(i) > 1){
                    ans.add(list.get(i));
                }
            }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(lonelyNumber(nums));
    }
}
