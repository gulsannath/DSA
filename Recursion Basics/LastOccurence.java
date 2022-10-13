import java.util.Scanner;
public class LastOccurence {

    public static int lastOccurence(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        else if(i == 0){
            return -1;
        }
        else{
            return lastOccurence(arr, key, i-1);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2,5,7,8,3,5,0,9,6,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key you want to find the last Occurence:");
        int key = sc.nextInt();
        int end = arr.length-1;
        System.out.print(lastOccurence(arr, key, end));
    }
}
