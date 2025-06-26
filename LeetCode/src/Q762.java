public class Q762 {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(countPrimeSetBits(left,right));

    }


    public static int countPrimeSetBits(int left, int right) {
        int allCount = 0;
        for(int i = left; i <= right;i++)
        {
            int num = i;
            int count = Integer.bitCount(num);
            if(isPrime(count) == true)
            {
                allCount++;
            }
        }
        return allCount;

    }

    public static boolean isPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
        for(int i = 2; i < num;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
