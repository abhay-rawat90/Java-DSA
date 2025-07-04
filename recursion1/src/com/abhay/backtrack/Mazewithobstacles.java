package com.abhay.backtrack;

public class Mazewithobstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathrest("",board,0,0);


    }

    static void pathrest(String p,boolean[][] maze,int r,int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        if(r == maze.length -1)
        {
            pathrest(p + 'R',maze,r,c+1);
            return;

        }
        if(c == maze[0].length - 1)
        {
            pathrest(p +'D',maze,r+1,c);
            return;

        }

        pathrest(p +'D',maze,r+1,c);
        pathrest(p + 'R',maze,r,c+1);
    }
}
