import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class slidingWindowFirstInt {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k  = 3;
        System.out.println(firstNegInt(arr,k));


    }

    public static List<Integer> firstNegInt(int arr[], int k) {
        int i = 0;
        int j = 0;
        Queue<Integer> ql = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while(j < arr.length)
        {
            if(arr[j] < 0)
            {
                ql.add(arr[j]);
            }

            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                if(ql.size() == 0)
                {
                    ans.add(0);
                }

                else {
                    ans.add(ql.peek());
                    if(arr[i] == ql.peek())
                    {
                        Integer remove = ql.remove();
                    }
                }
                i++;
                j++;
            }
        }

        return ans;

    }
}
