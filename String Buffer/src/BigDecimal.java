public class BigDecimal {
    public static void main(String[] args) {
        BD();




    }

    static void BD()
    {
        double x = 0.03;
        double y = 0.04;
//        double ans = y-x;
//        System.out.println(ans);

        java.math.BigDecimal X = new java.math.BigDecimal("0.03");
        java.math.BigDecimal Y = new java.math.BigDecimal("0.04");
        java.math.BigDecimal ans = Y.subtract(X);
        System.out.println(ans);

    }
}
