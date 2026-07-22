import java.util.Arrays;

/**
 * Task 19: Array Sorting
 * Problem: Read numbers into an array and sort them in ascending order.
 */
public class ArraySorting {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {9, 3, 7, 1, 5};
        
        // Print the original array
        System.out.print("Original Array: ");
        printArray(numbers);
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.print("Sorted Array: ");
        printArray(numbers);
    }
    
    // Helper method to print array elements
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
