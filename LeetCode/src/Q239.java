import com.sun.source.tree.Tree;

import java.util.*;

public class Q239 {
    public static void main(String[] args) {
        int[] nums = {9,10,9,-7,-4,-8,2,-6};
        int k =5;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));

    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        TreeMap<Integer,Integer> ql = new TreeMap<>(Comparator.reverseOrder());
        while(j < nums.length)
        {
            ql.put(nums[j],ql.getOrDefault(nums[j],0) +1);

            if(j-i+1 < k)
            {
                j++;
            }

            else if(j-i+1 == k)
            {
                ans.add(ql.firstKey());
                if(ql.get(nums[i]) == 1)
                {
                    ql.remove(nums[i]);
                }
                else{
                    ql.put(nums[i],ql.get(nums[i]) -1);
                }
                i++;
                j++;
            }



        }
        int[] ans1 = ans.stream()
                .mapToInt(Integer::intValue) // or i -> i
                .toArray();

        return ans1;




    }


}
