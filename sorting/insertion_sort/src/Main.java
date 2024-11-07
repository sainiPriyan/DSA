import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,12,7,10,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];

            int j = i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]=temp;

                System.out.println(Arrays.toString(arr));
        }
    }
}
