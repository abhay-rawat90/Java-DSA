import java.util.HashMap;
import java.util.Map;

public class Q560 {
    public static void main(String[] args) {
        int[] nums = {4,1,1,1,-2,-3,5};
        int k = -5;
        System.out.println(subarraySum(nums,k));

    }

    public static int subarraySum(int[] nums, int k) {
//        int i = 0;
//        int j = 0;
//        int sum = 0;
//        int count = 0;
//        while(j < nums.length)
//        {
//            sum = sum + nums[j];
//
//            if(sum < k)
//            {
//                j++;
//            }
//
//            else if(sum == k)
//            {
//                count++;
//                j++;
//            }
//
//            else if( sum > k)
//            {
//                while(sum > k)
//                {
//                    sum = sum - nums[i];
//                    i++;
//                }
//                if(sum == k)
//                {
//                    count++;
//                }
//                j++;
//            }
//
//        }
//
//        return count;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;



    }
}
