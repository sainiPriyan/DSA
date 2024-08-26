import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }
    public static int[] leftRotate(int[] arr){

        int temp = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;

        return arr;
    }
}
