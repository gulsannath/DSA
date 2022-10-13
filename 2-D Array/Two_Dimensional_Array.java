import java.util.*;
public class Two_Dimensional_Array {
    public static void largest_Smallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest number in the matrix is:"+largest);
        System.out.println("The smallest number in the matrix is:"+smallest);
    }

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("The element "+key+" is found at index "+i+"th row and "+j+"th column");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter the element at "+i+"th row "+j+"th column:");
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        largest_Smallest(matrix);
    }
}
