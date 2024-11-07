import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(getSum(2,5,new int[]{1,1,2,3,4,5,6,7,8}));
        System.out.println();
        System.out.println(Arrays.toString(sumArray(new int[]{1,1,2,3,2,1,5})));
        System.out.println();
        System.out.println(preFixSum(2,6,sumArray(new int[]{1,1,2,3,2,1,5})));

    }

    public static int getSum(int a, int b, int[] arr){
        int sum =0;
        for (int i = a; i <=b ; i++) {
            sum+= arr[i];
        }
        return sum;
    }

    public static int preFixSum(int a, int b, int[] arr){
        if (a == 0) return arr[b];
        else return (arr[b] - arr[a-1]);
    }

    public static int[] sumArray(int[] arr){
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
             sum[i] = arr[i]+sum[i-1];
        }
        return sum;
    }



}
