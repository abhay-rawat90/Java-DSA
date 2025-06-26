import java.util.Hashtable;

public class Q904 {
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        System.out.println(totalFruit(fruits));

    }

    public static int totalFruit(int[] fruits) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        int i = 0;
        int j = 0;
        int mx = 1;
        while( j < fruits.length)
        {
            ht.put(fruits[j],ht.getOrDefault(fruits[j],0)+1);
            if(ht.size() <= 2)
            {
                if(j-i+1 > mx)
                {
                    mx = j-i+1;
                }
                j++;
            }

            else if(ht.size() > 2)
            {
                while(ht.size() > 2)
                {
                    ht.put(fruits[i],ht.get(fruits[i])-1);
                    if(ht.get(fruits[i]) == 0)
                    {
                        ht.remove(fruits[i]);
                    }
                    i++;
                }
                j++;
            }
        }

        return mx;

    }
}
