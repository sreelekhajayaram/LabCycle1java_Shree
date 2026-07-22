/**
 * Task 18: Pattern Printing
 * Problem: Print a right triangle pattern using nested loops.
 */
public class PatternPrinting {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
