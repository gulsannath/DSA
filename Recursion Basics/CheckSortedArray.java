public class CheckSortedArray {

    public static boolean checkSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        else{
            return checkSorted(arr, i+1);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,5};
        int start = 0;
        System.out.print(checkSorted(arr,start));
    }
}
