public class Que3021 {
    public static void main(String[] args) {
        int[] nums = {3,3,3};
        System.out.println(triangleType(nums));

    }

    public static String triangleType(int[] nums) {
        if(nums.length != 3)
        {
            return "none";
        }
        int count  = 0;
        int i =0;
        while(nums[i] != nums[i+1] && i == 2 )
        {
            count++;
            i++;
        }
        if(count == 0)
        {
            return "scalene";
        }
        if(count == 1)
        {
            return "isosceles";
        }

        if(count == 2)
        {
            return "equilateral";
        }
        return "none";

    }
}
