import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create original array
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take position from user
        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        // Take value from user
        System.out.print("Enter the value: ");
        int value = sc.nextInt();

        // Create a new array with one extra space
        int[] newArr = new int[n + 1];

        // Copy elements before the insertion position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new value
        newArr[position] = value;

        // Copy remaining elements one position to the right
        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        System.out.println("Array after insertion:");

        for (int x : newArr) {
            System.out.print(x + " ");
        }

        // Close Scanner
        sc.close();
    }
}
