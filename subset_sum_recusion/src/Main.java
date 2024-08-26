public class Main {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{50,-15,-25},0,3));

    }
    public static int sum(int[] arr, int sum, int n){

        if(n==0) {
            if (sum == 0)
             return 1;
            else return 0;
        }

        return sum(arr,sum,n-1)+sum(arr,sum-arr[n-1],n-1);
    }
}
