public class PatternPrinting {
    public static void main(String[] args) {
        printRightTriangle(5); // Calling method with size 5
    }
    
    /**
     * Prints a right triangle pattern using asterisks
     * @param size The number of rows in the triangle
     */
    public static void printRightTriangle(int size) {
        // Outer loop for number of rows
        for (int row = 1; row <= size; row++) {
            // Inner loop for printing stars in each row
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Move to next line after each row is printed
            System.out.println();
        }
    }
}