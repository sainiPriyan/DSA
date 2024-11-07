import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate90(int[][] arr){
        matrixTranspose(arr);
        swapRows(arr);
    }
    public static void matrixTranspose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void swapRows(int[][] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
