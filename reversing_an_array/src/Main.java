import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversingArray(new int[]{1, 2, 3,4})));

        System.out.println(Arrays.toString(reverse3(new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},10)));
    }
    public static int[] reversingArray(int[] arr){
        int i =0,temp;
        while(arr.length-1-i - i >0){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

            i++;
        }
        return arr;
    }

    public static int[] reverse2(int arr[]){
        int temp;

        int low = 0,high = arr.length-1;


        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        return arr;
    }

    public static long[] reverse3(long arr[], int n){
        long temp;

        for(int i =0; i< n/2; i++){

            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
            ArrayList<Integer> list = new ArrayList<>();
            list.size();
            list.get();
            list.set()
        }
        return arr;

    }
}
