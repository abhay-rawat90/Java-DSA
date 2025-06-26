import java.util.Scanner;

public class practiseee {
    public static void main(String[] Args){
      Scanner sc= new Scanner(System.in);
//        int s=sc.nextInt();
        int[] arr ={1,2,3,2,1,4};

        //precompute
        int[] hash=new int[13];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int size=sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int a=sc.nextInt();
            System.out.println(hash[i]);
        }

//        while(q>0){
//            char ch;
//            ch=sc.next().charAt(0);
//            //fetch
//            System.out.println(hash[ch-'a']);
//        }


    }
}