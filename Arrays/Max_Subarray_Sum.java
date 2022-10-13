// BRUTE-FORCE APPROACH O(n^3)
public class Max_Subarray_Sum {

    public static void maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.print(currSum);
                System.out.println();
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.print("Max Subarrays Sum:"+ maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
