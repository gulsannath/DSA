
public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            //find the current position  of the element to insert
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            //insert the element to the correct position
            arr[j+1] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        insertionSort(arr);
        printArr(arr);
    }
}
