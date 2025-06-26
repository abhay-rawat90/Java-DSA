import java.util.Hashtable;

public class Q76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(intminWindow(s,t));

    }

    public static String intminWindow(String s, String t) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for (int i = 0; i < t.length(); i++) {
            ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int count = ht.size();
        String ans = "";
        while(j < s.length())
        {

            if(ht.containsKey(s.charAt(j)))
            {
                ht.put(s.charAt(j),ht.get(s.charAt(j))-1);

                if(ht.get(s.charAt(j)) == 0)
                {
                    count--;

                }
                if(count == 0)
                {
                    if(j-i+1 < min)
                    {
                        min = j-i+1;
                        ans = s.substring(i,j+1);
                    }
                    while(count == 0)
                    {
                        if(ht.containsKey(s.charAt(i)))
                        {
                            ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
                                if(ht.get(s.charAt(i)) > 0)
                                {
                                    count++;
                                }
                                i++;
                        }
                        else
                        {
                            i++;
                        }

                        if(count == 0) {
                            if (j - i + 1 < min) {
                                min = j - i + 1;
                                ans = s.substring(i, j + 1);
                            }
                        }
                    }

                }

                j++;

            }

            else {
                j++;
            }



        }
        return ans;


    }
}
