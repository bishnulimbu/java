public class Jagged {
    public static void main(String[] args) {
        // Initialize a jagged array of integers
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };

        // Display the jagged array and calculate the sum of each row
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j];
            }
            System.out.println("=> Sum: " + rowSum);
        }
    }
}
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Initialize a jagged array of integers
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
            {10}
        };

        // Display the jagged array and calculate the sum of each row
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j];
            }
            System.out.println("=> Sum: " + rowSum);
        }
    }
}
