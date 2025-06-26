import java.util.*;

public class Q215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));

    }

    public static  ArrayList<Integer> findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size() > k)
            {
                Integer poll = pq.poll();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty())
        {
            int a = pq.poll();
            ans.addFirst(a);
        }
        return ans;

    }
}
