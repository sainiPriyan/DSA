import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{0,1,0,0},{0 ,0,0,0},{1,0,0,0},{0,0,0,0}};
        booleanMatrix(matrix);

        System.out.println(Arrays.deepToString(matrix));

    }

    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    public static void booleanMatrix(int[][] matrix){

        boolean row1 = false, column1 = false;

        for(int i = 0; i<matrix.length;i++){
            if(matrix[i][0] == 1){
                column1 = true;
                break;
            }
        }
        for(int j = 0; j<matrix[0].length;j++){
            if(matrix[0][j] == 1){
                row1 = true;
                break;
            }
        }

        for (int i = 1; i<matrix.length;i++){
            for(int j = 1; j<matrix[0].length;j++){

                if(matrix[i][j] == 1){
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }

        for (int i = 1; i<matrix.length;i++){
            if(matrix[i][0] == 1){
                for(int j = 1; j<matrix[0].length;j++){
                    matrix[i][j] = 1;
                }
            }
        }

        for (int j =1; j<matrix[0].length;j++){
            if(matrix[0][j] == 1){
                for(int i = 1; i<matrix.length;i++){
                    matrix[i][j] = 1;
                }
            }
        }

        if(row1)
            for(int j = 0; j<matrix[0].length;j++)
                matrix[0][j] = 1;

        if(column1)
            for(int i = 0; i<matrix.length;i++)
                matrix[i][0] = 1;
    }
}
