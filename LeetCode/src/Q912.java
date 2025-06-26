import java.util.Arrays;
import java.util.PriorityQueue;

public class Q912 {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));

    }

    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int b = pq.poll();
            nums[i] = b;
        }

        return nums;

    }
}
