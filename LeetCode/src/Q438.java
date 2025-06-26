import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Q438 {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));

    }

    public static List<Integer> findAnagrams(String s, String p) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for (int i = 0; i < p.length(); i++) {
            ht.put(p.charAt(i), ht.getOrDefault(p.charAt(i),0) +1);
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = p.length();
        int count = ht.size();
        while(j < s.length())
        {
            if(ht.containsKey(s.charAt(j)))
            {
                ht.replace(s.charAt(j),ht.get(s.charAt(j))- 1);
                if(ht.get(s.charAt(j)) == 0)
                {
                    count--;
                }
            }
            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                if(count == 0)
                {
                    ans.add(j+1-k);
                }
                if(ht.containsKey(s.charAt(i)))
                {
                    if(ht.get(s.charAt(i)) == 0)
                    {
                        count++;
                    }
                    ht.replace(s.charAt(i),ht.get(s.charAt(i))+1);

                }
                i++;
                j++;

            }

        }

        return ans;

    }
}
