public class Main {
    public static void main(String[] args) {

            System.out.println(maxiSubArrSum(new int[]{-3,8,-2,4,-5,6}));
    }
    public static int maxiSubArrSum(int[] arr){
        int  sum = arr[0], max = sum;

        for (int i = 1; i < arr.length; i++) {

            sum = Math.max(arr[i], sum + arr[i]);
//           if (arr[i] > sum + arr[i]) {
//                sum = arr[i];
//            } else {
//                sum += arr[i];
//            }
            max = Math.max(max, sum);
        }
        return max;
    }

}
