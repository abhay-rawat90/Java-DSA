package com.abhay.backtrack;

import java.util.Arrays;

public class allpaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathrestprint("",board,0,0,path,1);


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
        maze[r][c] = false;

        if(r < maze.length -1)
        {
            pathrest(p + 'D',maze,r + 1,c);

        }
        if(c < maze[0].length - 1)
        {
            pathrest(p +'R',maze,r,c + 1);

        }
        if(r > 0)
        {
            pathrest(p + 'U',maze,r-1,c);
        }
        if(c>0)
        {
            pathrest(p + 'L',maze,r,c-1);
        }

        maze[r][c] =true;
    }

    static void pathrestprint(String p,boolean[][] maze,int r,int c,int[][] path,int step)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            path[r][c] =step;
            for(int[] arr : path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length -1)
        {
            pathrestprint(p + 'D',maze,r + 1,c,path,step+1);

        }
        if(c < maze[0].length - 1)
        {
            pathrestprint(p +'R',maze,r,c + 1,path,step+1);

        }
        if(r > 0)
        {
            pathrestprint(p + 'U',maze,r-1,c,path,step+1);
        }
        if(c>0)
        {
            pathrestprint(p + 'L',maze,r,c-1,path,step+1);
        }

        maze[r][c] =true;
        path[r][c] = 0;
    }
}
