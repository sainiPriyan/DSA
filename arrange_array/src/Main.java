import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrange(new long[]{4 ,5 ,3 ,2 ,1}, 5)));

    }
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.

    public static long[] arrange(long[] arr, int n){

        long temp;
        int index;

        for (int i = 0; i < n; i++) {

            if(arr[i]>=n) continue;

            index = (int) arr[i];

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
