import java.util.Scanner;
public class FirstOccurence {

    public static int firstOccurence(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        else if(i == arr.length-1){
            return -1;
        }
        else{
            return firstOccurence(arr,key,i+1);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,3,2,5,6,3,9,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to find the first Occurence:");
        int key = sc.nextInt();
        int start = 0;
        System.out.print(firstOccurence(arr,key,start));
    }
}
