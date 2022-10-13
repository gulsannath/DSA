import java.util.Scanner;
public class FindAllOccurences{

    public static void findOccurences(int arr[],int idx, int key){
        //Base Case
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        findOccurences(arr, idx+1, key);
    }
    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element You want find all occurences in the array:");
        int key = sc.nextInt();
        int start = 0;
        findOccurences(arr, start, key);
    }
}