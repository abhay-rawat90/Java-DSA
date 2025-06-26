public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        StringBuffer sb2 = new StringBuffer("Abhay");

        StringBuffer sb3 = new StringBuffer(30);
        buffer.append("Wemakedevs");

        buffer.insert(2,"Rawat");

        String str = buffer.toString();
        System.out.println(str);

    }
}