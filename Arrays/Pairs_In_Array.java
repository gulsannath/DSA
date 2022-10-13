public class Pairs_In_Array {

    public static void pairs(int arr[]){
        int totalPairs = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs:"+totalPairs);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        pairs(arr);
    }
}
