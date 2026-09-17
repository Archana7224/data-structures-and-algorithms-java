public class Main {
    public static void main(String [] args){
        // Declare and initialize an integer array
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        // n stores the length of the array

        // Create an auxiliary array to store reversed elements
        // Auxiliary array = an extra array used to store temporary results
        int[] reversed = new int[n];
        // Create a reversed array of the same length as the original array
        // Fill the reversed array using the reverse-index formula
        for(int i = 0; i < n ; i++) 
        {
            // reverse formula
            // n - 1 gives the last valid index of the array
            reversed[i] = arr[n -1-i];
            // Printing the reversed array
            System.out.print(reversed[i] + " ");
    }   }
}