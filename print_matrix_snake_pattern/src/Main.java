public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        printSnake(matrix);

    }

    public static void printSnake(int[][] arr){

        for (int i = 0; i < arr.length; i++) {

            if(i%2==0)
                for (int j = 0; j < arr[i].length; j++)
                    System.out.print(arr[i][j]+ " ");


            else
                for (int j = arr[i].length - 1; j >= 0 ; j--)
                    System.out.print(arr[i][j]+ " ");

            System.out.println();
        }
    }
}
