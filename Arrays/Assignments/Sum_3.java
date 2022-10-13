import java.util.*;
public class Sum_3 {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            //handle the duplicates of a 
            if(i==0 || nums[i-1] != nums[i]){
                //target = 0 --> so, a+b+c = 0 i.e, b+c = 0-a
                twoSumSorted(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
        
        return res;
    }

    void twoSumSorted(int i, int j, int nums[], int target){
        int a = nums[i-1];
        while(i<j){ //Search space 
            if(nums[i]+nums[j] > target){
                j--;
            }else if(nums[i]+nums[j] < target){
                i++;
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(a);list.add(nums[i]);list.add(nums[j]);

                res.add(list);

                //duplicate b
                while(i<j && nums[i] == nums[i+1]) i++;
                //duplicate c
                while(i<j && nums[j] == nums[j-1]) j--;

                i++;j--;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {-1, 0,  1, 2, -1, -4};
        threeSum(nums);
    }
}
