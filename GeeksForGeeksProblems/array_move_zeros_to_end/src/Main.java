import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(movesZerosToEnd(new int[]{0,1, 2, 0, 0, 3, 0, 4})));

        System.out.println(Arrays.toString(moveZerosAlt(new int[]{0,1, 2, 0, 0, 3, 0, 4})));
    }
    public static int[] movesZerosToEnd(int[] arr){

        int x = -1;

        if (arr[0] == 0) x=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0 && arr[i-1] != 0)
                x = i;
            if(arr[i]!=0 && x!=-1){
                arr[x] = arr[i];
                arr[i] =0;
                x++;
            }
        }
        return arr;
    }

    public static int[] moveZerosAlt(int[] arr){
        int count =0;

        for (int i =0;i<arr.length;i++){

            if(arr[i]!= 0 ){

                arr[count] = arr[i];
                arr[i] = 0;

                count++;
            }
        }
        return arr;
    }
}
