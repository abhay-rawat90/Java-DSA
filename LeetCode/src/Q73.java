import java.util.ArrayList;
import java.util.HashMap;

public class Q73 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setZeroes(int[][] matrix) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i = 0;i < matrix.length;i++)
        {
            for(int j = 0;j < matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    hm.computeIfAbsent(i,k -> new ArrayList<>()).add(j);
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            if(hm.containsKey(i))
            {
                ArrayList<Integer> arr = hm.get(i);
                for (int j = 0; j < matrix[i].length; j++)
                {
                    matrix[i][j] = 0;
                }

                for (int j = 0; j < arr.size(); j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][arr.get(j)] = 0;
                    }

                }
            }
        }
    }
}
