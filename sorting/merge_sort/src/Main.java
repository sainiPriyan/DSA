import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 1, 5, -10};
        mergeSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }

    }


    public static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1,
                n2 = high - mid;

        int[] left = new int[n1], right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[low+i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid+j+1];

        int i = 0, j = 0,k = low;

        while(i<n1 && j<n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1) {
            arr[k] =left[i];
            i++;
            k++;
        }
        while(j<n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
