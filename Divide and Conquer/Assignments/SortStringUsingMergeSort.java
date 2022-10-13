public class SortStringUsingMergeSort {

    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortStringsUsingMergeSort(String arr[], int start, int end){
        //Base Case
        if(start >= end){
            return;
        }

        int mid = start+(end-start)/2;
        sortStringsUsingMergeSort(arr, start, mid);
        sortStringsUsingMergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void merge(String arr[], int start, int mid, int end){
        String temp[] = new String[end-start+1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
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
    }
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","mercury"};
        int start = 0;
        int end  = arr.length-1;
        sortStringsUsingMergeSort(arr, start, end);
        printArr(arr);
    }
}
