public class Main {
    public static void main(String[] args) {
        System.out.println(maxCircularSubArraySum(new int[]{5,-3,-6,-6,7,10}));

    }
    public static int maxCircularSubArraySum(int[] arr){

        if (arr.length == 1) return arr[0];

        int i = arr.length/2, start = i, sum = arr[start], max = sum,
                sum2 = arr[0], max2 = sum2;

        for (int j = 1; j < arr.length; j++) {

            sum2 = Math.max(arr[j], sum2 + arr[j]);
            max2 = Math.max(max2, sum2);
        }
        while(true){

            i++;
            if(i == arr.length) i = 0;
            else if(i == start) break;

            sum = Math.max(arr[i],sum+arr[i]);
            max = Math.max(max,sum);

        }

        return Math.max(max,max2);
    }

//    public static int maxCircularSubArraySum2(int[] arr){
//        int sum = arr[0],min = sum;
//
//        for (int i = 1; i<arr.length;)
//    }

}
