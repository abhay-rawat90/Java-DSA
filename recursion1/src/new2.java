import java.util.Arrays;
import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            ans(arr);
            System.out.println();
        }

        scanner.close();
    }

    static int max(int[] arr) {
        int m = 0;
        for (int value : arr) {
            m = m + value;
        }
        return m;
    }

    static void ans(int[] arr) {
        int n = max(arr);
        Arrays.sort(arr);
        for (int value : arr) {
            System.out.print(n + " ");
            n = n - value;
        }
    }
}
