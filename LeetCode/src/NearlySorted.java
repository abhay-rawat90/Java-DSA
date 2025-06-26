import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NearlySorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3, 6, 7, 8, 9, 10};
        int k = 2;
        nearlySorted(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k)
            {
                int a = pq.poll();
                arr[count] = a;
                count++;
            }
        }
        for (int i = count; i < arr.length; i++) {
            int b = pq.poll();
            arr[i] = b;
        }

    }
}