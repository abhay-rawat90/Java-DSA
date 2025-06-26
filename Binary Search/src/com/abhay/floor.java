package com.abhay;

public class floor {
    public static void main(String[] args) {
        int[] arr = {-4,-2,2, 3, 5, 9, 14, 16, 18,21,24,56};
        int target = 34;
        System.out.println(floor(arr, target));

    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target> arr[arr.length-1])
            {
                return -1;
            }
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;

            }
            if (target > arr[mid]) {
                start = mid + 1;

            }
        }
        return arr[end];
    }

}
