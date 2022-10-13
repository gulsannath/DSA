
public class SubArrays {
    
    public static void subArrays(int arr[]){
        int totalSubarrays = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total no. of Subarrays are:"+totalSubarrays);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
