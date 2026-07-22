/**
 * Task 20: Search Element in Array
 * Problem: Search a given element in an array and display its 1-based position.
 */
public class SearchElement {
    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        
        int position = -1; // -1 indicates not found
        
        // Linear search algorithm
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i + 1; // 1-based position
                break;
            }
        }
        
        // Output result
        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
