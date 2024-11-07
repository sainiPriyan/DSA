public class Main {
    public static void main(String[] args) {
        System.out.println(maxSumOfKConsecutiveElements(8,new int[]{0,2,-3,4,-5,1,-1}));

    }
    public static int maxSumOfKConsecutiveElements(int k, int[] arr){

        if(k>arr.length) return -6969;

        int sum = 0,max =0,count = 0;
        for (int i = 0; i < arr.length ; i++) {

            if(count<k){
                sum+= arr[i];
                count++;
                max = sum;
            }
            else{
                sum+= arr[i] - arr[i-k];
            }
            max = Math.max(max,sum);
        }

        return max;
    }
}
