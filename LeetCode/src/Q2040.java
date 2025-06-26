import java.util.Comparator;
import java.util.PriorityQueue;

public class Q2040 {
    public static void main(String[] args) {
        int[] nums1 = {-100000,100000};
        int[] nums2 = {-100000,100000};
        int k = 1;
        System.out.println(kthSmallestProduct(nums1,nums2,k));

    }

    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                long mult = (long) nums1[i] * nums2[j];
                pq.add(mult);
            }
        }
        while(pq.size() != k)
        {
            Long a = pq.poll();
        }

        long ans = pq.peek();
        return ans;



    }
}
