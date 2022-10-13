public class Search_Element_In_A_Matrix {

    public static boolean stairCaseSearch(int matrix[][], int key){
            int row = 0;
            int col = matrix[0].length-1;

            // T(n)=O(n+m)
            while(row <= matrix.length-1 && col >= 0){
                
                if(key == matrix[row][col]){
                    System.out.print("The element "+key+" is found at index:("+row+","+col+")");
                    return true;
                }

                else if(key < matrix[row][col]){
                    col--;
                }

                else{
                    row++;
                }
            }
            System.out.print("The element "+key+"is not found");
            return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
                        
        int key = 33;
        stairCaseSearch(matrix, key);
    }
}
