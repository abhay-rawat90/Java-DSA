import java.util.Scanner;

public class Que71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            String word = sc.next();
            if(word.length() <= 10)
            {
                System.out.println(word);
            }
            else{
                int midCount = word.length() - 2;
                System.out.println(word.charAt(0) + ""+ midCount+ word.charAt(word.length() -1 ));
            }
            t--;
        }
    }
}
