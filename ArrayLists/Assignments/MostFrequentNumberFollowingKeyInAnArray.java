import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentNumberFollowingKeyInAnArray {

    public static int mostFrequentFollowing(ArrayList<Integer> nums, int key){
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) == key){
                
                if(!map.containsKey(nums.get(i+1))){
                    map.put(nums.get(i+1), 1);
                }else{
                    int freq = map.get(nums.get(i+1));
                    map.put(nums.get(i+1), ++freq);
                }

                if(map.get(nums.get(i+1)) > max){
                    max = map.get(nums.get(i+1));
                    ans = nums.get(i+1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        
        int key = 1;

        System.out.println("The Most following key for the given key "+key+" is:"+mostFrequentFollowing(nums, key));
    }
}
