import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{4, 1, 3 ,9, 7};

        Solution.selectionSort(array,5);

        System.out.println(Arrays.toString(array));
    }
}
class Solution {
    static int select(int arr[], int i) {

        int small = Integer.MAX_VALUE, index = 0;

        for (int j = i; j < arr.length; j++) {

            if(small>arr[j]){
                small = arr[j];
                index = j;
            }
        }
        return index;

    }

    static void selectionSort(int arr[], int n) {

        int minimum, temp;

        for (int i = 0; i < n - 1; i++) {
            minimum = select(arr, i);

            temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }

    }
}

