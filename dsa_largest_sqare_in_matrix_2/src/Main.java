public class Main {
    public static void main(String[] args) {

       int[][] mat = new int[][]{
//                {0, 1, 1, 0, 1},
//                {1, 1, 0, 1, 0},
//                {0, 1, 1, 1, 0},
//                {1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 1},
//                {0, 0, 0, 0, 0}

               {1},{0},{1},{1},{0}};
            int m = 1,n=5;
        System.out.println(Solution.maxSquare(n,m,mat));




    }



}
class Solution {
    static int maxSquare(int n, int m, int mat[][]) {

        int up, left, corner, max = 0;

        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i++) {
            arr[0][i] = mat[0][i];
            if(mat[0][i]== 1) max = 1;
        }

        for (int i = 0; i < n; i++) {
            arr[i][0] = mat[i][0];
            if(mat[i][0]== 1) max = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (mat[i][j] == 1) {

                    corner = arr[i - 1][j - 1];
                    left = arr[i][j - 1];
                    up = arr[i - 1][j];

                    System.out.println(corner+" "+left+" "+up);

                    arr[i][j] = Math.min(up, Math.min(corner, left)) + 1;
                }

                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }

}
