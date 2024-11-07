import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,10,15,20,40,8,11,55,60,60,60,60};
        merge(arr,5,9,15);
        System.out.println(Arrays.toString(arr));

    }
    public static void merge(int[] arr, int low, int mid, int high){
        while(mid <= high && low<mid){

            if(arr[mid]<arr[low]){
                int temp = arr[mid];
                for (int i = mid; i>low  ; i--) {
                    arr[i] = arr[i-1];
                }
                arr[low] = temp;
                mid++;
            }
            else{
                low++;
            }
        }
    }

    public static void merge2(int[] arr, int low, int mid, int high) {
        int n1 = mid - low +1, n2 = high- mid;

        int[] left = new int[n1], right = new int[n2];

        for (int i = low; i < n1; i++) left[i] = arr[low+i];
        for (int i = 0; i < n2; i++) right[i] = arr[mid+i+1];

        int i = 0, j = 0,k = low;

        while(i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
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

