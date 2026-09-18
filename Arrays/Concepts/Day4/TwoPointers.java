// Two pointers are used to point to two elements in an array.. 
// There are mainly two types of array 
// 1.Opposite direction two pointer approach - one at the right end and one on left end of the array and they move towards each other
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // To input the array size and elements from the user 
        Scanner sc = new Scanner(System.in);
        // the array is of size n which is input by the user
        int n = sc.nextInt();
        // Creating an new array size n 
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0; // left pointer at the start of the array
        int right = n - 1; // right pointer at the end of 
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}