import java.util.Arrays;
import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            // Read the number of integers in the array
            int n = scanner.nextInt();
            int[] array = new int[n];

            // Read the integers into the array
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }

            // Calculate the minimum number of moves
            results[i] = minMovesToNonDecreasing(array);
        }

        // Print the results for each test case
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int minMovesToNonDecreasing(int[] array) {
        int moves = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                // Calculate the moves needed to make array[i] >= array[i - 1]
                moves += (array[i - 1] - array[i]);
                // Increment the current element to match the previous element
                array[i] = array[i - 1];
            }
        }
        return moves;
    }
}

