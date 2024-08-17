import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversingArray(new int[]{1, 2, 3,4})));

        System.out.println(Arrays.toString(reverse2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
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
}
