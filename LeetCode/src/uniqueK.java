import java.util.Hashtable;

public class uniqueK {
    public static void main(String[] args) {
        String s = "aabaaab";
        int k = 2;
        System.out.println(longestkSubstr(s,k));

    }

    public static int longestkSubstr(String s, int k) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        int i = 0;
        int j = 0;
        int mx = -1;
        int ans = 0;
        while(j < s.length())
        {
            ht.put(s.charAt(j),ht.getOrDefault(s.charAt(j),0) +1);

            if(ht.size() < k)
            {
                j++;
            }
            else if(ht.size() == k)
            {
                ans = j-i+1;
                mx = Math.max(mx,ans);
                j++;
            }

            else if(ht.size() > k)
            {
                while(ht.size() != k)
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
        }

        return mx;

    }
}
