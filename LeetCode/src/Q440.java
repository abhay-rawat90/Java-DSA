import java.util.Arrays;

public class Q440 {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        String[] arr = new String[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = String.valueOf(i+1);
        }
        Arrays.sort(arr);
        int ans = Integer.parseInt(arr[k-1]);
        System.out.println(ans);
    }
}
