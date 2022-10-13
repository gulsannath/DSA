//T(N) = O(N^2)
public class MajorityElementBruteForce {

    public static int majorityElement(int arr[]){
        int majorityCount = arr.length/2;

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count += 1;
                }
            }
            if(count >  majorityCount){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        if(majorityElement(arr) > 0){
            System.out.print("Majority element is:"+majorityElement(arr));
        }
        else{
            System.out.print("There is no majority element exist in the array which is greater then the halfcount of the array length");
        }
    }
}
