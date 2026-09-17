// INPUT ARRAY IN THE CODE 
public class Main{
    public static void main(String[] args){
        // Input array
        int[] arr = {10,20,30,40};
        // n holds the length of the array
        int n = arr.length;
// Decide what to insert and where to insert it
// position holds the value of 2
        int position = 2;
        // value holds the value of 25
        int value = 25;

// Creating a bigger array to hold the new element
        int[] newArr = new int[ n + 1];
        // n+1 because we are inserting only one element into the array


        for (int i=0;i< position;i++){
            // Copy everything that comes before position 2
            newArr[i] = arr[i];
        }
        // Insert the new value at the specified position
        newArr[position] = value;
        
        // Shifting the remaining elements
        for(int i = position; i < n; i++){
            newArr[i+1] = arr[i];
            // i+1 because we need to move each remaining element one step forward
        }
        // Print the new array after insertion
        for(int x: newArr){
            System.out.print(x + " ");
        }
    }
}


// USER INPUT ARRAY AND POSITION 
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