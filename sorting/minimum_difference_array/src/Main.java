import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMinDifference(new int[]{1,10,14,30,100,3,2}));

    }
    public static int getMinDifference(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if(arr.length == 1) return Integer.MAX_VALUE;

        int diff = arr[1]-arr[0];

        for (int i = 2; i < arr.length; i++) {
            diff = Math.min(arr[i] - arr[i-1],diff);
        }
        return diff;
    }
}
