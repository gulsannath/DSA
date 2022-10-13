import java.util.Scanner;
public class SearchInARotatedAndSortedArray {

    public static int search(int arr[], int start, int end, int target){
        //Base Case
        if(start > end){
            return -1;
        }

        int mid = start+(end-start)/2;

        //if element is found at mid index
        if(arr[mid] == target){
            return mid;
        }
        //Target on Line-1
        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target <= arr[mid]){
                return search(arr, start, mid-1, target);
            }else{
                return search(arr, mid+1, end, target);
            }
        }
        //Target on Line-2
        else{
            if(arr[mid] <= target && target <= arr[end]){
                return search(arr, mid+1, end, target);
            }else{
                return search(arr, start, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to Search:");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int tIdx = search(arr, start, end, target);
        System.out.print("The target is found at the index:"+tIdx);
    }
}
