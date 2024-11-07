import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,12,7,10,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        for (int i = 0;i<arr.length;i++){
            int min = i;

            for (int j =i+1;j< arr.length;j++) {
                if (arr[j] < arr[min]) min = j;

            }
                if (min != i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;

            }
        }
    }
}
