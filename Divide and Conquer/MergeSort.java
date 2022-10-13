public class MergeSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int start,int end){
        //Base Case
        if(start >= end){
            return;
        }

        int mid = start+(end-start)/2;
        mergeSort(arr, start, mid);//for left part of the array
        mergeSort(arr, mid+1, end);//for right part of the array
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for the left sorted element which was not enter into temp array during sorting
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //for the right sorted element which was not enter into temp array during sorting
        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,6,3,-2};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
        printArr(arr);
    }
}