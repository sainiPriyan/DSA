public class Main {
    public static void main(String[] args) {
        System.out.println(subArrayWithGivenSum(6, new int[]{1,2,30,15,5,6}));

    }
    public static boolean subArrayWithGivenSum(int s, int [] arr){
        int sum = arr[0],pole=0;

        for (int i = 1; i < arr.length; i++) {
            if(sum < s)
                sum+= arr[i];

            while(sum>s){
                sum-= arr[pole];
                pole++;
            }

            if(sum == s) return true;
        }

        return false;
    }
}
