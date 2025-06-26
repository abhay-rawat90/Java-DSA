import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Q2200 {
    public static void main(String[] args) {
        int[] nums ={2,2,2,2,2};
        int key = 2;
        int k = 2;
        System.out.println(findKDistantIndices(nums,key,k));

    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        while(j < nums.length)
        {
            if(nums[j]  == key)
            {
                int start = j-k;
                int end = j+k;
                if(start < 0)
                {
                    start = 0;
                }
                if(end > nums.length-1)
                {
                    end = nums.length-1;
                }
                for (int l = start; l <= end ; l++) {
                    ht.put(l,ht.getOrDefault(l,0)+1);
                    if(ht.get(l) == 1)
                    {
                        ans.add(l);
                    }
                }
                j++;
            }
            else
            {
                j++;
            }
        }
        return ans;

    }
}
