import java.util.*;
public class CountSort {
    public static void countSort(int arr[]){
        //Find out min and max from the given array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int range = max-min+1;
        int freq[] = new int[range];
        //for counting the frequencies of elements present in the array
        for(int i=0;i<arr.length;i++){
            int idx = arr[i] - min;
            freq[idx]++;
        }

        //Make the freq array which will denote the prefixSum. i.e, the last index of the elements
        for(int i=1;i<freq.length;i++){
            freq[i] += freq[i-1];
        }

        int ans[] = new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            int val = arr[i];
            int pos = freq[val - min];
            int idx = pos-1;
            ans[idx] = val;
            freq[val - min]--;
        }

        //copy to original array
        for(int i=0;i<ans.length;i++){
            arr[i] = ans[i];
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,3,4,9,5,4,3,9,6,8,7,6,5,9};
        countSort(arr);
        printArr(arr);
    }
}
