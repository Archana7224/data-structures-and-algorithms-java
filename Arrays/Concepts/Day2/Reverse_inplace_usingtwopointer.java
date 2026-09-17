public class Main {
    public static void main(String[] args) {

        // Declare and initialize an integer array
        int[] arr = {10, 20, 30, 40, 50};

        // left points to the first index of the array
        int left = 0;

        // right points to the last index of the array
        int right = arr.length - 1;

        // Continue swapping until left and right pointers meet
        while (left < right) {

            // Temporarily store the value at the left index
            int temp = arr[left];

            // Put the value from the right index into the left index
            arr[left] = arr[right];

            // Put the original left value into the right index
            arr[right] = temp;

            // Move the left pointer one step toward the center
            left++;

            // Move the right pointer one step toward the center
            right--;
        }

        // Traverse the array and print each element
        for (int x : arr) {

            // Print the current element followed by a space
            System.out.print(x + " ");
        }
    }
}