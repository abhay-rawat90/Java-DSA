import java.util.HashMap;
import java.util.Map;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        System.out.println(rob(nums));
    }

    static int Max = 0;
    static Map<String, Integer> memo = new HashMap<>();

    public static int rob(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return nums[0];
        }

        boolean[] check = new boolean[l];
        helper(nums, check, 0, 0);
        return Max;
    }

    public static void helper(int[] nums, boolean[] check, int i, int sum) {
        int n = nums.length;
        if (i == n) {
            Max = Math.max(Max, sum);
            return;
        }

        // Memoization: use the current state of `check` and index `i` as a key
        String key = getKey(check, i);
        if (memo.containsKey(key) && memo.get(key) >= sum) {
            return;
        }
        memo.put(key, sum);

        if (isValid(check, i)) {
            sum += nums[i];
            if (i >= 1) check[i - 1] = true;
            if (i < n - 1) check[i + 1] = true;

            helper(nums, check, i + 1, sum);

            // Backtracking
            sum -= nums[i];
            if (i >= 1) check[i - 1] = false;
            if (i < n - 1) check[i + 1] = false;
        }

        helper(nums, check, i + 1, sum);
    }

    public static boolean isValid(boolean[] check, int i) {
        return !check[i];
    }

    public static String getKey(boolean[] check, int i) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : check) {
            sb.append(b ? '1' : '0');
        }
        sb.append('_').append(i);
        return sb.toString();
    }
}
