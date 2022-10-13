//T(N) = O(N)
//Moore's voting Algorithm

public class MajorityElementOptimisedSolution {

    public static int majorityElement(int arr[]) {
        int majority = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = arr[i];
                    count = 1;
                }
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.print("The majority element in the array is:" + majorityElement(arr));
    }
}
