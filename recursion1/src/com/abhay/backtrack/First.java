package com.abhay.backtrack;

public class First {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
        pathdiag("",3,3);

    }

    static int maze(int r, int c)
    {
        if(r == 1 || c == 1)
        {
          return 1;
        }

        int down = maze(r-1,c);
        int right = maze(r,c-1);
        return down + right;
    }

    static void path(String p,int r,int c)
    {
        if(r ==1 && c == 1)
        {
            System.out.println(p);
            return;
        }

        if(r == 1)
        {
            path(p + 'R',r,c-1);
            return;

        }
        if(c == 1)
        {
            path(p +'D',r-1,c);
            return;

        }

        path(p +'D',r-1,c);
        path(p + 'R',r,c-1);
    }
    static void pathdiag(String p,int r,int c)
    {
        if(r ==1 && c == 1)
        {
            System.out.println(p);
            return;
        }

        if(r == 1)
        {
            pathdiag(p + 'R',r,c-1);
            return;

        }
        if(c == 1)
        {
            pathdiag(p +'D',r-1,c);
            return;

        }

        pathdiag(p + 'd',r-1,c-1);
        pathdiag(p +'D',r-1,c);
        pathdiag(p + 'R',r,c-1);
    }
}
