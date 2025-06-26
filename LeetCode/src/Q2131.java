import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;

public class Q2131 {
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));
    }

    public static int longestPalindrome(String[] words) {
        Hashtable<String,Integer> freq = new Hashtable<>();
        int pairLength = 0;
        for (int i = 0; i < words.length; i++) {
            freq.put(words[i],freq.getOrDefault(words[i],0) + 1);
        }

        for(String word : freq.keySet())
        {
            String rev = "" + word.charAt(1) + word.charAt(0);

            if(!word.equals(rev) && freq.containsKey(rev))
            {
                int pair = Math.min(freq.get(word), freq.get(rev));

                pairLength += pair*4;
                freq.put(word, freq.get(word) -pair);
                freq.put(rev, freq.get(rev) - pair);
            }
        }
        int center = 0;
        for(String word : freq.keySet())
        {
            if(word.charAt(0) == word.charAt(1))
            {
                int count = freq.get(word);

                pairLength += (count / 2) * 4;

                if(count % 2 == 1)
                {
                    center = 2;
                }
            }
        }

        return pairLength + center;

    }

    public static boolean ispal(String ans)
    {
        int left = 0;
        int right = ans.length() - 1;
        while(left < right)
        {
            if(ans.charAt(left) != ans.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
