import java.util.Arrays;

public class Q128 {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        int count = 1;
        int mx = 1;
        Arrays.sort(nums);
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i = 0;i < nums.length-1;i++)
        {
            if(nums[i+1] == nums[i]+1)
            {
                count++;
                if(count > mx)
                {
                    mx = count;
                }
            }
            else if(nums[i] == nums[i+1])
            {
                continue;
            }

            else
            {

                count = 1;
            }

        }
        return mx;

    }
}
