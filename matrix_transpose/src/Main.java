import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixTranspose(matrix);


    }

   public static void matrixTranspose(int[][] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr[0].length; j++) {
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
           }
       }
       System.out.println(Arrays.deepToString(arr));
   }
}
