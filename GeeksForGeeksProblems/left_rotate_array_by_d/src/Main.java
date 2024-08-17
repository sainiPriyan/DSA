import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

     rotateArr2(array,9);

     System.out.println(Arrays.toString(array));
    }
    public static int[] rotateArr(int[] arr, int d){

        int[] temp = new int[d];

        for(int j = 0;j<d;j++){
            temp[j] = arr[j];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
            }

        for(int k = 0; k<d;k++){
            arr[arr.length-d+k] = temp[k];
        }

        return arr;
    }

    public static void rotateArr2(int[] arr, int d){

        int n = arr.length;

        reverse(arr,0,d-1);
        reverse(arr, d,n-1);
        reverse(arr,0, arr.length-1);
    }

    public static void reverse(int arr[], int high, int low){
        int temp;

        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }
}
