public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralTraversal(matrix);

    }
    public static void spiralTraversal(int[][] arr) {

        int top = 0, bottom = arr.length-1, left = 0, right = arr[0].length-1;

        while(left<=right && top<=bottom){

            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
             right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }

        }
    }
}
