package com.abhay;

import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        System.out.println(moves(t));
    }

    static int moves(int t)
    {
        int move = 0;
        int position = 0;
        int step = 1;

        while (position != t) {
            if (position < t)
            {
                position += step;
            } else {
                position -= step;
            }
            step++;
            move++;
        }

        return move;
    }
}
