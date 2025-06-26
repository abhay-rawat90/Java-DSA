import java.util.Hashtable;

public class Q3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        int i = 0;
        int j = 0;
        int mx = 0;
        while(j < s.length())
        {
            ht.put(s.charAt(j),ht.getOrDefault(s.charAt(j),0) +1);
            if(ht.size() < j-i+1)
            {
                while(ht.size() < j-i+1)
                {
                    ht.put(s.charAt(i),ht.get(s.charAt(i))-1);
                    if(ht.get(s.charAt(i)) == 0)
                    {
                        ht.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }

            else if(ht.size() == j-i+1)
            {
                mx = Math.max(mx,j-i+1);
                j++;
            }
        }

        return mx;


    }
}
