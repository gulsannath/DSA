//Kedane's Algorithm
public class Max_Subarray_Sum_III {

    public static void maxSubarraySumKedanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum +=  arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        //     currSum = Math.max(currSum+arr[i], arr[i]);
        //     maxSum = Math.max(currSum, maxSum);
        }
        System.out.print("The Max Subarray Sum is:"+maxSum);
    }
    public static void main(String arrgs[]){
        int numbers[] = {-1,-2,-6,-1,-3};
        maxSubarraySumKedanes(numbers);
    }
}
