public class HalfDiamondStarNumberPattern {
    public static void main(String[] args) {
        // Determine the number of rows for the pattern
        int rows = 6;

        // Print the ascending part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print the numbers and stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the descending part of the diamond
        for (int i = rows - 1; i > 0; i--) {
            // Print spaces before the stars
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print the numbers and stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}