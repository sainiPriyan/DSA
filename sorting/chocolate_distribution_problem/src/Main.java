import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(chocolateDistribution(new int[]{3,7,2,100,10,20,22,21},5));

    }
    public static int chocolateDistribution(int[] arr,int k){

        if(arr.length < k) return Integer.MAX_VALUE;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int diff = arr[k-1]-arr[0];

        for (int i = k; i < arr.length; i++) {
            diff = Math.min(arr[i] - arr[i-k+1],diff);
        }
        return diff;
    }
}
