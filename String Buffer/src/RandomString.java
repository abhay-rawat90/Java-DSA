import java.text.DecimalFormat;
import java.util.Random;

public class RandomString {
    public static String generate(int size)
    {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (char)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }

        return sb.toString();

    }
public static void main(String[] args) {
    int n = 20;
    String name = generate(n);
    System.out.println(name);

    DecimalFormat df = new DecimalFormat("0.0000");
    System.out.println(df.format(7.29));
}
}
