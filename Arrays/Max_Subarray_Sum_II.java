// Prefix Sum (On^2) and space-> O(n)
public class Max_Subarray_Sum_II {

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        //Calculate the prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum = (i==0)?prefix[j]:prefix[j] - prefix[i-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print("Max Subarray Sum is:"+maxSum);
    }

    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        maxSubarraySum(arr);
    }
}
