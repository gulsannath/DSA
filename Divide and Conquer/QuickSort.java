public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[], int start, int end){
        //Base Case
        if(start >= end){
            return;
        }
        
        //pivot -> last element
        int pIdx = partition(arr,start,end);
        quickSort(arr, start, pIdx-1);
        quickSort(arr, pIdx+1, end);

    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];

        int i = start-1;

        for(int j=start;j<end;j++){
            if(arr[j] <= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String args[]){
        int arr[] = {6,3,5,8,2,9};
        int start = 0;
        int end = arr.length-1;
        quickSort(arr, start, end);
        printArr(arr);
    }
}
