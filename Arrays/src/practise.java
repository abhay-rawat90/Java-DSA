import java.util.Scanner;

public class practise {
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();

        //precompute
        int[] hash= new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int q;
        q=sc.nextInt();
        while(q>0){
            char ch;
            ch=sc.next().charAt(0);
            //fetch
            System.out.println(hash[ch-'a']);
        }

    }
}
