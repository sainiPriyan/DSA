public class Main {
    public static void main(String[] args) {
        System.out.println(longestEvenOddSubArray(new int[]{1,1,1,2,3,4,4,4,4,2,2,1}));

    }
    public static int longestEvenOddSubArray(int[] arr){
        int n = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i]+arr[i-1]) % 2 != 0){
                n++;
                max = Math.max(n,max);
            }
            else{
                n = 1;
            }
        }
        return max;
    }

}
