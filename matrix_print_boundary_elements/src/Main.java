public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,5,6,7},{2,8,9,10},{3,11,12,13},{4,14,15,16}};
        printBoundary(array);

    }

    public static void printBoundary(int[][] arr ){

        if(arr.length == 1)
            for (int i = 0; i < arr[0].length; i++)
                System.out.print(arr[0][i]+" ");

       else if(arr[0].length==1)
            for (int i = 0; i < arr.length ; i++)
                System.out.print(arr[i][arr[i].length - 1] + " ");

        else {

            for (int i = 0; i < arr[0].length; i++)
                System.out.print(arr[0][i] + " ");

            for (int i = 1; i < arr.length - 1; i++)
                System.out.print(arr[i][arr[i].length - 1] + " ");


            for (int i = arr[arr.length - 1].length - 1; i >= 0; i--)
                System.out.print(arr[arr.length - 1][i] + " ");


            for (int i = arr.length - 2; i >= 1; i--)
                System.out.print(arr[i][0] + " ");
        }

    }
}
