import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,6,7,6,5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(i);

            boolean swapped = false;

            for (int j = 0; j < arr.length-1-i; j++) {

                if(arr[j]<arr[j+1]){

                    swapped = true;

                    //swapping

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped) break;
        }
    }
}
