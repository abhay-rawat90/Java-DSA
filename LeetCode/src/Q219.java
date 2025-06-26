import java.util.Hashtable;

public class Q219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k =3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        int i = 0;
        int j = 0;
        if(k == 0)
        {
            return false;
        }
        while(j < nums.length)
        {
            ht.put(nums[j],ht.getOrDefault(nums[j],0)+1);
            if(ht.get(nums[j]) < 2)
            {
                j++;
            }
            else if(nums[i] == nums[j] && ht.get(nums[j]) == 2)
            {
                if(Math.abs(i-j) <= k)
                {
                    return true;
                }

                else {
                    ht.put(nums[i],ht.get(nums[i])-1);
                    i++;
                    j++;
                }
            }
            else {
                ht.put(nums[j],ht.get(nums[j])-1);
                i++;
            }
        }
        return false;

    }
}
