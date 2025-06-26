package com.abhay;

public class leet2381 {
    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters(s,shifts));

    }

    public static String shiftingLetters(String s, int[][] shifts) {
        int start;
        int end;
        int dir;
        char[] arr = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < shifts.length; i++) {
            start = shifts[i][0];
            end = shifts[i][1];
            dir = shifts[i][2];

            for (int j = start; j <= end ; j++) {
                if(dir == 0)
                {
                    int num = s.charAt(j);
                    if(num == 97)
                    {
                        num = 122;
                    }
                    else{
                        num--;
                    }
                    arr[j] = (char) num;


                }

                if(dir == 1)
                {
                    int num = s.charAt(j);
                    if(num == 122)
                    {
                        num = 97;
                    }
                    else{
                        num++;
                    }
                    arr[j] = (char) num;

                }

            }
            for (int l = 0; l < arr.length; l++) {
                str.append((arr[l]));
            }

            s = str.toString();
            str = new StringBuilder("");


        }


        return s;

    }
}
