import java.util.Hashtable;

public class Q2461 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,7,8,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));

    }


    public static long maximumSubarraySum(int[] nums, int k) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        int i = 0;
        int j = 0;
        long sum = 0;
        long mx = 0;

        while(j < nums.length)
        {
            sum = sum + nums[j];
            ht.put(nums[j], ht.getOrDefault(nums[j],0) +1);

            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                if(ht.size() < k)
                {
                    sum = sum - nums[i];

                    int leftNum = nums[i];
                    int leftCount = ht.get(leftNum);
                    ht.put(leftNum, leftCount - 1);
                    if(ht.get(leftNum) == 0) ht.remove(leftNum);

                    i++;
                    j++;
                }
                else
                {
                    mx = Math.max(mx,sum);
                    sum = sum - nums[i];

                    int leftNum = nums[i];
                    int leftCount = ht.get(leftNum);
                    ht.put(leftNum, leftCount - 1);
                    if(ht.get(leftNum) == 0) ht.remove(leftNum);

                    i++;
                    j++;
                }
            }
        }
        return mx;

    }
}
