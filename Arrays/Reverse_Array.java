public class Reverse_Array {

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4 };
        reverse(numbers);
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
