
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<=arr.length-2;turn++){
            int swaps = 0; // we will take swaps for best case compasrison where the array is sorted before we can run it in O(N).As after 1st turn we will check swaps value if it will 0 then no swaps so we will return from first turn
            for(int j=0;j<=arr.length-2-turn;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                return;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
