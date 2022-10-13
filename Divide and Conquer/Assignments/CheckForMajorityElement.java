public class CheckForMajorityElement {

    public static boolean isMajority(int arr[]){
        int majorityCount = arr.length/2;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(returnCandidate(arr) == arr[i]){
                count++;
            }
        }
        if(count > majorityCount){
            return true;
        }else{
            return false;
        }
    }

    public static int returnCandidate(int arr[]){
        int candidate = arr[0];
        int count = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] == candidate){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println("Is Majority element present:"+isMajority(arr));
        if(isMajority(arr)){
            System.out.print("The Majority element is:"+returnCandidate(arr));
        }
    }
}
