public class Main {
    public static void main(String[] args) {

        System.out.println(equilibriumPoint(sumArray(new int[]{1,1,1,2,3})));
        System.out.println();
        System.out.println(equilibriumPoint2(new int[]{1,1,1,2,3}));


        String s = "Bellow Word";
        if(s.charAt(0) == 'B'){
            System.out.println("yesgr");
        }

    }
    public static int equilibriumPoint(int[] arr){

        if(arr[arr.length-1]-arr[0]==0) return 0;

        for (int i =1; i<arr.length;i++){
            if(arr[arr.length-1] - arr[i-1] == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int[] sumArray(int[] arr){
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = arr[i]+sum[i-1];
        }
        return sum;
    }

    public static int equilibriumPoint2(int[] arr){

        int leftSum = 0,rightSum =0;

        for (int j : arr) {
            leftSum += j;
        }

        for (int i = 0;i< arr.length;i++){

            leftSum-= arr[i];

            if(leftSum  == rightSum)
                return i+1;

            rightSum += arr[i];

        }
        return -1;
    }



}
