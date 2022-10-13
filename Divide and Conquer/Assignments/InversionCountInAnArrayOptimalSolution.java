//Using Modified MergeSort -> O(N log N)
// S(n) = o(n)
public class InversionCountInAnArrayOptimalSolution {

    public static int modifiedMergeSort(int arr[], int start, int end){
        
        int inversionCount = 0;

        if(end > start){
            int mid = start+(end-start)/2;
            
            inversionCount += modifiedMergeSort(arr, start, mid);
            inversionCount += modifiedMergeSort(arr, mid+1, end);
            inversionCount += merge(arr, start, mid, end);
        }
        return inversionCount;
    }

    public static int merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end-start+1];

        int inversionCount = 0;

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                inversionCount += (mid+1-i);
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        
        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return inversionCount;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int start = 0;
        int end  = arr.length-1;
        System.out.print("The total no. of inversion of the array is:"+modifiedMergeSort(arr, start, end));
    }
}
