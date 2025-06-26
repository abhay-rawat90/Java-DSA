public class Q2414 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(longestContinuousSubstring(s));


    }

    public static int longestContinuousSubstring(String s) {
        int count = 1;
        int mx = 1;
        if(s.length() == 0)
        {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i+1) == s.charAt(i)+1)
            {
                count++;
                if(count > mx)
                {
                    mx = count;
                }
            }

            else if(s.charAt(i) == s.charAt(i+1))
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
