
import java.util.Scanner;
public class ChangeArrayValueBy2{

    public static void changeArr(int arr[], int i, int val){
        //Base Case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        arr[i] = val;
        //Recursion
        changeArr(arr, i+1, val+1);

        //Backtrack
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int startIdx = 0;
        int startVal = 1;
        changeArr(arr, startIdx, startVal);
        printArr(arr);
    }
}