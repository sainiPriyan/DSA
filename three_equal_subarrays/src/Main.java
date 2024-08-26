public class Main {
    public static void main(String[] args) {

        System.out.println(threeEqualSubArrays(sumArray(new int[]{2,2,4,1,3}),4));

    }
    public static boolean threeEqualSubArrays(int[] arr, int s){
        boolean a=false,b=false;

        if(s*3 != arr[arr.length-1]) return false;

        for (int j =0;j< arr.length;j++) {
            if (arr[j] == s) {
                a = true;
                System.out.print("First range = 0 to "+ j+"\n"+ "Second range = "+(j+1));}

            if (arr[j] == s * 2) {
                b = true;
                System.out.println(" to "+ j);
            }
        }

        return a&b;

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
